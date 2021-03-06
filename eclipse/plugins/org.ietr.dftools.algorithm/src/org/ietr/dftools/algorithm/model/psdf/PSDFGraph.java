package org.ietr.dftools.algorithm.model.psdf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jscl.math.Expression;
import jscl.math.Generic;
import jscl.text.ParseException;

import org.ietr.dftools.algorithm.factories.ModelVertexFactory;
import org.ietr.dftools.algorithm.factories.PSDFEdgeFactory;
import org.ietr.dftools.algorithm.factories.PSDFVertexFactory;
import org.ietr.dftools.algorithm.model.AbstractGraph;
import org.ietr.dftools.algorithm.model.parameters.InvalidExpressionException;
import org.ietr.dftools.algorithm.model.parameters.NoIntegerValueException;
import org.ietr.dftools.algorithm.model.parameters.Parameter;
import org.ietr.dftools.algorithm.model.parameters.Value;
import org.ietr.dftools.algorithm.model.parameters.Variable;
import org.ietr.dftools.algorithm.model.parameters.factories.ArgumentFactory;
import org.ietr.dftools.algorithm.model.parameters.factories.ParameterFactory;
import org.ietr.dftools.algorithm.model.psdf.maths.GenericMath;
import org.ietr.dftools.algorithm.model.psdf.maths.NotSchedulableException;
import org.ietr.dftools.algorithm.model.psdf.parameters.PSDFDynamicArgument;
import org.ietr.dftools.algorithm.model.psdf.parameters.PSDFDynamicParameter;
import org.ietr.dftools.algorithm.model.psdf.parameters.factories.DynamicArgumentFactory;
import org.ietr.dftools.algorithm.model.psdf.parameters.factories.DynamicParameterFactory;
import org.ietr.dftools.algorithm.model.psdf.types.PSDFEdgePropertyType;
import org.ietr.dftools.algorithm.model.sdf.SDFAbstractVertex;
import org.ietr.dftools.algorithm.model.sdf.SDFEdge;
import org.ietr.dftools.algorithm.model.sdf.SDFGraph;
import org.ietr.dftools.algorithm.model.sdf.SDFInterfaceVertex;
import org.ietr.dftools.algorithm.model.sdf.esdf.SDFSinkInterfaceVertex;
import org.ietr.dftools.algorithm.model.sdf.esdf.SDFSourceInterfaceVertex;
import org.ietr.dftools.algorithm.model.sdf.types.SDFIntEdgePropertyType;
import org.ietr.dftools.algorithm.model.visitors.SDF4JException;
import org.jgrapht.EdgeFactory;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;

/**
 * Class representing Parameterized SDF graph see
 * "Parameterized Dataflow Modeling for DSP Systems" Bishnupriya Bhattacharya
 * and Shuvra S. Bhattacharyya
 * 
 * @author jpiat
 * 
 */
public class PSDFGraph extends SDFGraph {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6901456776112709371L;
	/**
	 * Property name for property sub_init
	 */
	public static final String SUB_INIT = "sub_init";

	/**
	 * Property name for property inits
	 */
	public static final String INIT = "init";

	public PSDFGraph() {
		super(new PSDFEdgeFactory());
		this.getPropertyBean().setValue(AbstractGraph.MODEL, "psdf");
	}

	public PSDFGraph(EdgeFactory<SDFAbstractVertex, SDFEdge> ef) {
		super(ef);
		this.getPropertyBean().setValue(AbstractGraph.MODEL, "psdf");
	}

	/**
	 * Adds a vertex to the graph
	 */
	@Override
	public boolean addVertex(SDFAbstractVertex vertex) {
		if (vertex instanceof PSDFInitVertex) {
			this.setInitVertex((PSDFInitVertex) vertex);
			return super.addVertex(vertex);
		} else if (vertex instanceof PSDFSubInitVertex) {
			this.setSubInitVertex((PSDFSubInitVertex) vertex);
			return super.addVertex(vertex);
		} else {
			return super.addVertex(vertex);
		}
	}

	/**
	 * Sets the sub-init vertex of the graph
	 * 
	 * @param subInit
	 *            The sub-init vertex to set
	 */
	public void setSubInitVertex(PSDFSubInitVertex subInit) {
		this.getPropertyBean().setValue(SUB_INIT, subInit);
	}

	/**
	 * Sets the init vertex of the graph
	 * 
	 * @param init
	 *            The init vertex to set
	 */
	public void setInitVertex(PSDFInitVertex init) {
		this.getPropertyBean().setValue(INIT, init);
	}

	/**
	 * Gives the sub-init vertex of the graph
	 * 
	 * @return The PSDFSubInitVertex of the graph
	 */
	public PSDFSubInitVertex getSubInitVertex() {
		if (this.getPropertyBean().getValue(SUB_INIT, PSDFSubInitVertex.class) != null) {
			return (PSDFSubInitVertex) this.getPropertyBean().getValue(
					SUB_INIT, PSDFSubInitVertex.class);
		}
		return null;
	}

	/**
	 * Gives the init vertex of the graph
	 * 
	 * @return The PSDFInitVertex of the graph
	 */
	public PSDFInitVertex getInitVertex() {
		if (this.getPropertyBean().getValue(INIT, PSDFInitVertex.class) != null) {
			return (PSDFInitVertex) this.getPropertyBean().getValue(INIT,
					PSDFInitVertex.class);
		}
		return null;
	}

	public Expression[][] getSymbolicTopologyMatrix() throws ParseException {
		if (this.getPropertyBean().getValue(TOPOLOGY) != null) {
			return (Expression[][]) this.getPropertyBean().getValue(TOPOLOGY);
		}
		int nbLi = 0;
		HashMap<SDFAbstractVertex, Integer> associateIndex = new HashMap<SDFAbstractVertex, Integer>();
		int i = 0;
		for (SDFAbstractVertex vertex : this.vertexSet()) {
			if (!(vertex instanceof SDFInterfaceVertex)
					&& this.edgesOf(vertex).size() != 0) {
				associateIndex.put(vertex, i);
				i++;
			}
		}
		for (SDFEdge edge : this.edgeSet()) {
			if (!(edge.getSource() instanceof SDFInterfaceVertex || edge
					.getTarget() instanceof SDFInterfaceVertex)
					&& !(edge.getSource() instanceof IPSDFSpecificVertex)) {
				nbLi++;
			}
		}
		Expression topo[][] = new Expression[nbLi][i];
		for (int k = 0; k < nbLi; k++) {
			for (int t = 0; t < i; t++) {
				topo[k][t] = Expression.valueOf("0");
			}
		}
		i = 0;
		for (SDFEdge edge : this.edgeSet()) {
			if (edge.getSource() == edge.getTarget()
					&& edge.getProd() instanceof PSDFEdgePropertyType
					&& edge.getCons() instanceof PSDFEdgePropertyType) {
				topo[i][associateIndex.get(this.getEdgeSource(edge))] = topo[i][associateIndex
						.get(this.getEdgeSource(edge))].add(Expression
						.valueOf("1"));
				topo[i][associateIndex.get(this.getEdgeTarget(edge))] = topo[i][associateIndex
						.get(this.getEdgeTarget(edge))].subtract(Expression
						.valueOf("1"));
				System.out
						.println("assuming consistency on looping edge, user should check for safety");
				i++;
			} else if (!(edge.getSource() instanceof SDFInterfaceVertex || edge
					.getTarget() instanceof SDFInterfaceVertex)) {
				topo[i][associateIndex.get(this.getEdgeSource(edge))] = topo[i][associateIndex
						.get(this.getEdgeSource(edge))].add(Expression
						.valueOf(edge.getProd().toString()));
				topo[i][associateIndex.get(this.getEdgeTarget(edge))] = topo[i][associateIndex
						.get(this.getEdgeTarget(edge))].subtract(Expression
						.valueOf(edge.getCons().toString()));
				i++;
			}

		}
		this.getPropertyBean().setValue(TOPOLOGY, topo);
		return topo;
	}

	@Override
	public boolean isSchedulable() {
		try {
			return this.computeVRB();
		} catch (InvalidExpressionException e) {
			return false;
		}
	}

	public boolean isSchedulable(Logger log) {
		try {
			return this.computeVRB();
		} catch (InvalidExpressionException e) {
			log.fine(e.getMessage());
			return false;
		}
	}

	/**
	 * Compute the vrb of this graph and affect the nbRepeat property to
	 * vertices
	 * 
	 * @throws InvalidExpressionException
	 */
	@Override
	protected boolean computeVRB() throws InvalidExpressionException {
		HashMap<SDFAbstractVertex, Generic> vrb;
		try {
			if (this.getParentVertex() != null) {
				vrb = GenericMath.computeRationnalVRBWithInterfaces(this);
			} else {
				vrb = GenericMath.computeRationnalVRB(this);
			}
		} catch (ParseException e) {
			throw (new InvalidExpressionException(e.getMessage()));
		} catch (NotSchedulableException e) {
			return false;
		}
		for (SDFAbstractVertex vertex : vrb.keySet()) {
			if (vrb.get(vertex) instanceof Generic) {
				Generic gNbR = vrb.get(vertex);
				try {
					int iNbr = Integer.parseInt(gNbR.toString());
					vertex.setNbRepeat(iNbr);
				} catch (NumberFormatException e) {
					vertex.setNbRepeat(vrb.get(vertex));
				}
			} else {
				vertex.setNbRepeat(vrb.get(vertex));
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public PSDFDynamicParameter getDynamicParameter(String p) {
		if (this.getPropertyBean().getValue(PARAMETERS, HashMap.class) != null) {
			Parameter param = ((HashMap<String, Parameter>) this
					.getPropertyBean().getValue(PARAMETERS)).get(p);
			if (param instanceof PSDFDynamicParameter) {
				return (PSDFDynamicParameter) param;
			}
		}
		return null;
	}

	@Override
	public boolean validateModel(Logger logger) throws SDF4JException {
		try {
			if (this.getPropertyBean().getValue(VALID_MODEL) != null) {
				return (Boolean) this.getPropertyBean().getValue(VALID_MODEL);
			}
			if (this.isSchedulable(logger)) {
				this.computeVRB();
				if (this.getVariables() != null) {
					for (Variable var : this.getVariables().values()) {
						int val;
						try {
							val = var.intValue();
							var.setValue(String.valueOf(val));
						} catch (NoIntegerValueException e) {
							e.printStackTrace();
						}
					}
				}

				if (this.getParameters() != null) {
					for (Parameter par : this.getParameters().values()) {
						if (this.getParentVertex().getArgument(par.getName()) instanceof PSDFDynamicArgument) {
							PSDFDynamicArgument dArg = (PSDFDynamicArgument) this
									.getParentVertex().getArgument(
											par.getName());
							this.addParameter(new PSDFDynamicParameter(par
									.getName(), dArg));
						}
					}
				}
				for (SDFAbstractVertex child : vertexSet()) {
					// logger.finest(child.getName()+" x"+child.getGenericNbRepeat
					// ());
					System.out.println(child.getName() + " x"
							+ child.getNbRepeat());
					if (!child.validateModel(logger)) {
						throw new SDF4JException(child.getName()
								+ " is not a valid vertex, verify arguments");
					}
					if (child.getGraphDescription() != null) {
						SDFGraph description = ((SDFGraph) child
								.getGraphDescription());
						if (!((SDFGraph) child.getGraphDescription())
								.validateModel(logger)) {
							throw (new SDF4JException(child
									.getGraphDescription().getName()
									+ " is not schedulable"));
						}
						List<SDFAbstractVertex> treatedInterfaces = new ArrayList<SDFAbstractVertex>();
						for (SDFEdge edge : this.incomingEdgesOf(child)) {
							SDFSourceInterfaceVertex sourceInterface = (SDFSourceInterfaceVertex) edge
									.getTargetInterface();
							if (treatedInterfaces.contains(sourceInterface)) {
								throw new SDF4JException(
										sourceInterface.getName()
												+ " is multiply connected, consider using broadcast ");
							} else {
								treatedInterfaces.add(sourceInterface);
							}
							if (description
									.getVertex(sourceInterface.getName()) != null) {
								SDFAbstractVertex trueSourceInterface = description
										.getVertex(sourceInterface.getName());
								for (SDFEdge edgeIn : description
										.outgoingEdgesOf(trueSourceInterface)) {
									if (edgeIn.getProd().intValue() != edge
											.getCons().intValue()) {
										throw new SDF4JException(
												sourceInterface.getName()
														+ " in "
														+ child.getName()
														+ " has incompatible outside consumption and inside production "
														+ edgeIn.getProd()
																.intValue()
														+ " != "
														+ edge.getCons()
																.intValue());
									}
								}
							}
						}

						for (SDFEdge edge : this.outgoingEdgesOf(child)) {
							SDFSinkInterfaceVertex sinkInterface = (SDFSinkInterfaceVertex) edge
									.getSourceInterface();
							if (treatedInterfaces.contains(sinkInterface)) {
								throw new SDF4JException(
										sinkInterface.getName()
												+ " is multiply connected, consider using broadcast ");
							} else {
								treatedInterfaces.add(sinkInterface);
							}
							if (description.getVertex(sinkInterface.getName()) != null) {
								SDFAbstractVertex trueSinkInterface = description
										.getVertex(sinkInterface.getName());
								for (SDFEdge edgeIn : description
										.incomingEdgesOf(trueSinkInterface)) {
									if (edgeIn.getCons().intValue() != edge
											.getProd().intValue()) {
										throw new SDF4JException(
												sinkInterface.getName()
														+ " in "
														+ child.getName()
														+ " has incompatible outside production and inside consumption "
														+ edgeIn.getProd()
																.intValue()
														+ " != "
														+ edge.getCons()
																.intValue());
									}
								}
							}
						}
					}
				}
				// solving all the parameter for the rest of the processing ...
				for (SDFEdge edge : edgeSet()) {
					if (!(edge.getCons() instanceof PSDFEdgePropertyType)) {
						edge.setCons(new SDFIntEdgePropertyType(edge.getCons()
								.intValue()));
					}
					if (!(edge.getDelay() instanceof PSDFEdgePropertyType)) {
						edge.setDelay(new SDFIntEdgePropertyType(edge
								.getDelay().intValue()));
					}
					if (!(edge.getProd() instanceof PSDFEdgePropertyType)) {
						edge.setProd(new SDFIntEdgePropertyType(edge.getProd()
								.intValue()));
					}
				}
				int i = 0;
				while (i < this.vertexSet().size()) {
					SDFAbstractVertex vertex = (SDFAbstractVertex) (this
							.vertexSet().toArray()[i]);
					if (this.outgoingEdgesOf(vertex).size() == 0
							&& this.incomingEdgesOf(vertex).size() == 0
							&& !(vertex instanceof IPSDFSpecificVertex)) {
						this.removeVertex(vertex);
						if (logger != null) {
							logger.log(
									Level.INFO,
									vertex.getName()
											+ " has been removed because it doesn't produce or consume data. \n This vertex has been used for repetition factor computation");
						}
					} else {
						i++;
					}
				}
				this.getPropertyBean().setValue(VALID_MODEL, true);
				return true;
			}
			return false;
		} catch (InvalidExpressionException e) {
			throw new SDF4JException(this.getName() + ": " + e.getMessage());
		}
	}

	@Override
	public SDFGraph clone() {
		PSDFGraph newGraph = new PSDFGraph();
		HashMap<SDFAbstractVertex, SDFAbstractVertex> matchCopies = new HashMap<SDFAbstractVertex, SDFAbstractVertex>();
		for (SDFAbstractVertex vertices : vertexSet()) {
			SDFAbstractVertex newVertex = vertices.clone();
			newGraph.addVertex(newVertex);
			matchCopies.put(vertices, newVertex);
		}
		for (SDFEdge edge : edgeSet()) {
			SDFEdge newEdge = newGraph.addEdge(
					matchCopies.get(edge.getSource()),
					matchCopies.get(edge.getTarget()));
			for (SDFInterfaceVertex sink : matchCopies.get(edge.getSource())
					.getSinks()) {
				if (edge.getTargetInterface() != null
						&& edge.getTargetInterface().getName()
								.equals(sink.getName())) {
					matchCopies.get(edge.getSource())
							.setInterfaceVertexExternalLink(newEdge, sink);
				}
			}
			for (SDFInterfaceVertex source : matchCopies.get(edge.getTarget())
					.getSources()) {
				if (edge.getSourceInterface() != null
						&& edge.getSourceInterface().getName()
								.equals(source.getName())) {
					matchCopies.get(edge.getTarget())
							.setInterfaceVertexExternalLink(newEdge, source);
				}
			}
			newEdge.copyProperties(edge);
		}
		newGraph.copyProperties(this);
		newGraph.getPropertyBean().setValue("topology", null);
		newGraph.getPropertyBean().setValue("vrb", null);
		return newGraph;
	}

	@Override
	public int solveExpression(String expression, Value caller)
			throws InvalidExpressionException, NoIntegerValueException {
		try {
			JEP jep = new JEP();
			if (this.getVariables() != null /* && !(caller instanceof Argument) */) {
				for (String var : this.getVariables().keySet()) {
					if (this.getVariable(var) == caller
							|| this.getVariable(var).getValue()
									.equals(expression)) {
						break;
					} else {
						jep.addVariable(var, this.getVariable(var).intValue());
					}
				}
			}
			if (this.getParameters() != null && this.getParentVertex() != null) {
				for (String arg : this.getParameters().keySet()) {
					try {
						Integer paramValue = this.getParameters().get(arg)
								.getValue();
						if (paramValue == null) {
							paramValue = this.getParentVertex()
									.getArgument(arg).intValue();
							this.getParameters().get(arg).setValue(paramValue);
						}
						jep.addVariable(arg, paramValue);
					} catch (NoIntegerValueException e) {
						if (expression.contains(arg)) {
							throw (new NoIntegerValueException(expression
									+ " is a dynamic expression"));
						}
						e.printStackTrace();
					}
				}
			}
			Node expressionMainNode = jep.parse(expression);
			Object result = jep.evaluate(expressionMainNode);
			if (result instanceof Double) {
				// System.out.println(expression+"="+result);
				return ((Double) result).intValue();
			} else if (result instanceof Integer) {
				// System.out.println(expression+"="+result);
				return ((Integer) result).intValue();
			} else {
				throw (new InvalidExpressionException(
						"Not a numerical expression"));
			}
		} catch (org.nfunk.jep.ParseException e) {
			throw (new InvalidExpressionException(expression
					+ " cannot be resolved"));
		}
	}

	@Override
	public ModelVertexFactory<?> getVertexFactory() {
		return PSDFVertexFactory.getInstance();
	}

	@Override
	public ParameterFactory getParameterFactory() {
		return new DynamicParameterFactory(this);
	}

	@Override
	public ArgumentFactory getArgumentFactory(SDFAbstractVertex v) {
		return new DynamicArgumentFactory(v);
	}
}
