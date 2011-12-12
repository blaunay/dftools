package net.sf.dftools.algorithm.demo;

import net.sf.dftools.algorithm.generator.SDFRandomGraph;
import net.sf.dftools.algorithm.model.parameters.InvalidExpressionException;
import net.sf.dftools.algorithm.model.sdf.SDFGraph;
import net.sf.dftools.algorithm.model.sdf.visitors.ToHSDFVisitor;
import net.sf.dftools.algorithm.model.sdf.visitors.TopologyVisitor;
import net.sf.dftools.algorithm.model.visitors.SDF4JException;

/**
 * Demo class to demonstrate the display features of a random graph
 * 
 * @author pthebault
 * 
 */
public class SDFGeneratorDemo{
	
	/**
	 * An alternative starting point for this test, to also allow running this
	 * applet as an application.
	 * 
	 * @param args
	 *            ignored.
	 * @throws InvalidExpressionException 
	 * @throws SDF4JException 
	 */

	public static void main(String[] args) throws InvalidExpressionException, SDF4JException {
		int nbVertex = 10, minInDegree = 1, maxInDegree = 5, minOutDegree = 1, maxOutDegree = 5;
		SDFAdapterDemo applet = new SDFAdapterDemo();

		// Creates a random SDF graph
		int minrate = 1, maxrate = 4;
		SDFRandomGraph test = new SDFRandomGraph();
		SDFGraph demoGraph = test.createRandomGraph(nbVertex, minInDegree,
				maxInDegree, minOutDegree, maxOutDegree, minrate, maxrate);

		TopologyVisitor topo = new TopologyVisitor();
		try {
			demoGraph.accept(topo);
		} catch (SDF4JException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		applet.init(demoGraph);

		SDFAdapterDemo applet3 = new SDFAdapterDemo();
		ToHSDFVisitor visitor2 = new ToHSDFVisitor();
		try {
			demoGraph.accept(visitor2);
		} catch (SDF4JException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		applet3.init(visitor2.getOutput());

	}

}