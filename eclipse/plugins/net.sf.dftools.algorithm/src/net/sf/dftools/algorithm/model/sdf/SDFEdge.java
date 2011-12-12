package net.sf.dftools.algorithm.model.sdf;

import net.sf.dftools.algorithm.model.AbstractEdge;
import net.sf.dftools.algorithm.model.AbstractEdgePropertyType;
import net.sf.dftools.algorithm.model.InterfaceDirection;
import net.sf.dftools.algorithm.model.PropertyFactory;
import net.sf.dftools.algorithm.model.parameters.InvalidExpressionException;
import net.sf.dftools.algorithm.model.sdf.types.SDFExpressionEdgePropertyType;
import net.sf.dftools.algorithm.model.sdf.types.SDFIntEdgePropertyType;
import net.sf.dftools.algorithm.model.sdf.types.SDFNumericalEdgePropertyTypeFactory;
import net.sf.dftools.algorithm.model.sdf.types.SDFStringEdgePropertyType;
import net.sf.dftools.algorithm.model.sdf.types.SDFTextualEdgePropertyTypeFactory;

/**
 * Class representing an SDFEdge which is an edge with production and consuming
 * rates and length of delay specified
 * 
 * @author jpiat
 * 
 */
public class SDFEdge extends AbstractEdge<SDFGraph, SDFAbstractVertex> {

	/**
	 * Property name for property edge_cons
	 */
	public static final String EDGE_CONS = "edge_cons";
	/**
	 * Property name for property edge_delay
	 */
	public static final String EDGE_DELAY = "edge_delay";
	/**
	 * Property name for property edge_prod
	 */
	public static final String EDGE_PROD = "edge_prod";
	/**
	 * Property name for data type
	 */
	public static final String DATA_TYPE = "data_type";

	/**
	 * Property name for property source_port
	 */
	public static final String SOURCE_PORT = "source_port";

	/**
	 * Property name for property target_port
	 */
	public static final String TARGET_PORT = "target_port";

	static {
		public_properties.add(EDGE_CONS);
		public_properties.add(EDGE_DELAY);
		public_properties.add(EDGE_PROD);
		public_properties.add(DATA_TYPE);
	};

	/**
	 * Creates an SDFEdge with the default values (prod=0,delay=0,cons=0)
	 */
	public SDFEdge() {
		super();
		setProd(new SDFIntEdgePropertyType(0));
		setCons(new SDFIntEdgePropertyType(0));
		setDelay(new SDFIntEdgePropertyType(0));
		setDataType(new SDFStringEdgePropertyType("char"));
	}

	/**
	 * Constructs a new SDFEdge with its consuming and producing rates with a
	 * delay
	 * 
	 * @param prod
	 * @param cons
	 * @param delay
	 * @param dataType
	 */
	public SDFEdge(AbstractEdgePropertyType<?> prod,
			AbstractEdgePropertyType<?> cons,
			AbstractEdgePropertyType<?> delay,
			AbstractEdgePropertyType<?> dataType) {
		super();
		setProd(prod);
		setCons(cons);
		setDelay(delay);
		setDataType(dataType);
	}

	/**
	 * Getter of the property <tt>cons</tt>
	 * 
	 * @return Returns the cons.
	 * 
	 */
	public AbstractEdgePropertyType<?> getCons() {
		AbstractEdgePropertyType<?> cons = (AbstractEdgePropertyType<?>) getPropertyBean()
				.getValue(EDGE_CONS, AbstractEdgePropertyType.class);
		if (cons instanceof SDFExpressionEdgePropertyType) {
			((SDFExpressionEdgePropertyType) cons).setExpressionSolver(this
					.getBase());
		}
		return cons;
	}

	/**
	 * Getter of the property <tt>delay</tt>
	 * 
	 * @return Returns the delay.
	 * 
	 */
	public AbstractEdgePropertyType<?> getDelay() {
		AbstractEdgePropertyType<?> delay = (AbstractEdgePropertyType<?>) getPropertyBean()
				.getValue(EDGE_DELAY, AbstractEdgePropertyType.class);
		if (delay instanceof SDFExpressionEdgePropertyType) {
			((SDFExpressionEdgePropertyType) delay).setExpressionSolver(this
					.getBase());
		}
		return delay;
	}

	/**
	 * Getter of the property <tt>prod</tt>
	 * 
	 * @return Returns the prod.
	 * 
	 */
	public AbstractEdgePropertyType<?> getProd() {
		AbstractEdgePropertyType<?> prod = (AbstractEdgePropertyType<?>) getPropertyBean()
				.getValue(EDGE_PROD, AbstractEdgePropertyType.class);
		if (prod instanceof SDFExpressionEdgePropertyType) {
			((SDFExpressionEdgePropertyType) prod).setExpressionSolver(this
					.getBase());
		}
		return prod;
	}

	/**
	 * Getter of the property <tt>DATA_TYPE</tt>
	 * 
	 * @return Returns the prod.
	 * 
	 */
	public AbstractEdgePropertyType<?> getDataType() {
		return (AbstractEdgePropertyType<?>) getPropertyBean().getValue(
				DATA_TYPE, AbstractEdgePropertyType.class);
	}

	/**
	 * Give the source interface of this edge
	 * 
	 * @return The source vertex interface of this edge
	 */
	public SDFInterfaceVertex getSourceInterface() {
		return (SDFInterfaceVertex) getPropertyBean().getValue(SOURCE_PORT,
				SDFInterfaceVertex.class);
	}

	/**
	 * Give the target interface of this edge
	 * 
	 * @return The interface vertex target of this edge
	 */
	public SDFInterfaceVertex getTargetInterface() {
		return (SDFInterfaceVertex) getPropertyBean().getValue(TARGET_PORT,
				SDFInterfaceVertex.class);
	}

	/**
	 * Setter of the property <tt>cons</tt>
	 * 
	 * @param cons
	 *            The cons to set.
	 * 
	 */
	public void setCons(AbstractEdgePropertyType<?> cons) {
		getPropertyBean().setValue(EDGE_CONS, null, cons);
		if (cons instanceof SDFExpressionEdgePropertyType) {
			((SDFExpressionEdgePropertyType) cons).setExpressionSolver(this
					.getBase());
		}
	}

	/**
	 * Setter of the property <tt>delay</tt>
	 * 
	 * @param delay
	 *            The delay to set.
	 * 
	 */
	public void setDelay(AbstractEdgePropertyType<?> delay) {
		getPropertyBean().setValue(EDGE_DELAY, null, delay);
		if (delay instanceof SDFExpressionEdgePropertyType) {
			((SDFExpressionEdgePropertyType) delay).setExpressionSolver(this
					.getBase());
		}
	}

	/**
	 * Setter of the property <tt>prod</tt>
	 * 
	 * @param prod
	 *            The prod to set.
	 * 
	 */
	public void setProd(AbstractEdgePropertyType<?> prod) {
		getPropertyBean().setValue(EDGE_PROD, null, prod);
		if (prod instanceof SDFExpressionEdgePropertyType) {
			((SDFExpressionEdgePropertyType) prod).setExpressionSolver(this
					.getBase());
		}
	}

	/**
	 * Setter of the property <tt>DATA_TYPE</tt>
	 * 
	 * @param type
	 *            The type to set.
	 * 
	 */
	public void setDataType(AbstractEdgePropertyType<?> type) {
		getPropertyBean().setValue(DATA_TYPE, null, type);
	}

	/**
	 * Set this edge source interface
	 * 
	 * @param source
	 *            The source interface to set for this edge
	 */
	public void setSourceInterface(SDFInterfaceVertex source) {
		getPropertyBean().setValue(SOURCE_PORT, null, source);
		if (source != null) {
			source.setDirection(InterfaceDirection.Output);
		}
	}

	/**
	 * Set this edge target interface
	 * 
	 * @param target
	 *            The target interface to set for this edge
	 */
	public void setTargetInterface(SDFInterfaceVertex target) {
		getPropertyBean().setValue(TARGET_PORT, null, target);
		if (target != null) {
			target.setDirection(InterfaceDirection.Input);
		}
	}

	/**
	 * Test if the given edge has the same properties than this edge
	 * 
	 * @param edge
	 *            The edge to compare with
	 * @return True if the given edge has the same properties, false otherwise
	 */
	public boolean compare(SDFEdge edge) {

		try {
			return super.compare(edge)
					&& edge.getSourceInterface().getName()
							.equals(this.getSourceInterface().getName())
					&& edge.getTargetInterface().getName()
							.equals(this.getTargetInterface().getName())
					&& (this.getCons().intValue() == edge.getCons().intValue())
					&& (this.getProd().intValue() == edge.getProd().intValue())
					&& (this.getDelay().intValue() == edge.getDelay()
							.intValue());
		} catch (InvalidExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public String toString() {
		return "{ d=" + getDelay() + ", p=" + getProd() + ", c=" + getCons()
				+ " }";
	}

	@Override
	public PropertyFactory getFactoryForProperty(String propertyName) {
		if (propertyName.equals(EDGE_CONS) || propertyName.equals(EDGE_PROD)
				|| propertyName.equals(EDGE_DELAY)) {
			return SDFNumericalEdgePropertyTypeFactory.getInstance();
		} else if (propertyName.equals(DATA_TYPE)) {
			return SDFTextualEdgePropertyTypeFactory.getInstance();
		}
		return null;
	}
}