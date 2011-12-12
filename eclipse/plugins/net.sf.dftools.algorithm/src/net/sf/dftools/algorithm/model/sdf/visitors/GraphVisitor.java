package net.sf.dftools.algorithm.model.sdf.visitors;

import net.sf.dftools.algorithm.model.AbstractEdge;
import net.sf.dftools.algorithm.model.AbstractGraph;
import net.sf.dftools.algorithm.model.AbstractVertex;
import net.sf.dftools.algorithm.model.visitors.SDF4JException;

/**
 * Interface of the SDF visitor
 * 
 * @author jpiat
 * @param <G> The graph type
 * @param <V> The vertex type
 * @param <E> The edge type
 * 
 */
@SuppressWarnings("rawtypes")
public interface GraphVisitor<G extends AbstractGraph,V extends AbstractVertex,E extends AbstractEdge> {

	/**
	 * Visit the given edge
	 * 
	 * @param sdfEdge
	 */
	public abstract void visit(E sdfEdge);

	/**
	 * Visit the given graph
	 * 
	 * @param sdf
	 * @throws SDF4JException 
	 */
	public abstract void visit(G sdf)throws SDF4JException;

	/**
	 * Visit the given  vertex
	 * 
	 * @param sdfVertex
	 * @throws SDF4JException 
	 */
	public abstract void visit(V sdfVertex)throws SDF4JException;

}