package org.ietr.dftools.algorithm.optimisations.clustering.stronglyconnected;

import java.util.ArrayList;
import java.util.Set;

import org.ietr.dftools.algorithm.model.parameters.InvalidExpressionException;
import org.ietr.dftools.algorithm.model.sdf.SDFAbstractVertex;
import org.ietr.dftools.algorithm.model.sdf.SDFEdge;
import org.ietr.dftools.algorithm.model.sdf.SDFGraph;
import org.ietr.dftools.algorithm.model.sdf.SDFInterfaceVertex;
import org.ietr.dftools.algorithm.model.visitors.SDF4JException;
import org.ietr.dftools.algorithm.optimisations.clustering.Clusterize;
import org.jgrapht.alg.StrongConnectivityInspector;

/**
 * Class to clusterize strongly connected components
 * @author jpiat
 *
 */
public class ClusterizeStronglyConnected {

	/**
	 * Clusterize strongly connected components
	 * @param graph The graph in which to look for clusters
	 * @throws InvalidExpressionException 
	 * @throws SDF4JException 
	 */
	public ClusterizeStronglyConnected(SDFGraph graph) throws InvalidExpressionException, SDF4JException{
		int i = 0 ;
		StrongConnectivityInspector<SDFAbstractVertex, SDFEdge> inspector = new StrongConnectivityInspector<SDFAbstractVertex, SDFEdge>(graph) ;
		for(Set<SDFAbstractVertex> strong : inspector.stronglyConnectedSets()){
			boolean noInterface = true ;
			for(SDFAbstractVertex vertex :strong){
				noInterface &= !(vertex instanceof SDFInterfaceVertex) ;
			}
			if(noInterface){
				Clusterize.culsterizeBlocks(graph, new ArrayList<SDFAbstractVertex>(strong), "cluster_"+i);
				i ++ ;
			}
			
		}
	}
}
