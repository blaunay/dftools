package net.sf.dftools.algorithm.factories;

import java.util.HashMap;

import net.sf.dftools.algorithm.model.AbstractVertex;
import net.sf.dftools.algorithm.model.InterfaceDirection;
import net.sf.dftools.algorithm.model.sdf.SDFAbstractVertex;
import net.sf.dftools.algorithm.model.sdf.SDFInterfaceVertex;
import net.sf.dftools.algorithm.model.sdf.SDFVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFBroadcastVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFForkVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFInitVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFJoinVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFRoundBufferVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFSinkInterfaceVertex;
import net.sf.dftools.algorithm.model.sdf.esdf.SDFSourceInterfaceVertex;

import org.w3c.dom.Element;

/**
 * Class used as an SDFVertex factory to provides user with convinient method to
 * creates SDFAbstractVertex
 * 
 * @author jpiat
 * 
 */
public class SDFVertexFactory extends ModelVertexFactory<SDFAbstractVertex> {

	
	private static SDFVertexFactory instance ;
	
	private SDFVertexFactory(){
		
	}
	
	
	
	public SDFAbstractVertex createVertex(Element vertexElt) {
		String kind = this.getProperty(vertexElt, AbstractVertex.KIND);
		if (kind.equals(SDFVertex.VERTEX)) {
			SDFVertex newVertex = new SDFVertex();
			newVertex.setName("default");
			return newVertex;
		} else if (kind.equals(SDFInterfaceVertex.PORT)) {
			String direction = this.getProperty(vertexElt,
					SDFInterfaceVertex.PORT_DIRECTION);
			if (direction != null) {
				if (direction.equals(InterfaceDirection.Input.name())) {
					return new SDFSourceInterfaceVertex();
				} else if (direction.equals(InterfaceDirection.Output.name())) {
					return new SDFSinkInterfaceVertex();
				}
				return null;
			}
		} else if (kind.equals(SDFBroadcastVertex.BROADCAST)) {
			return new SDFBroadcastVertex();
		} else if (kind.equals(SDFRoundBufferVertex.ROUND_BUFFER)) {
			return new SDFRoundBufferVertex();
		} else if (kind.equals(SDFForkVertex.FORK)) {
			return new SDFForkVertex();
		} else if (kind.equals(SDFJoinVertex.JOIN)) {
			return new SDFJoinVertex();
		} else if (kind.equals(SDFInitVertex.INIT)) {
			return new SDFInitVertex();
		}
		return null;
	}

	/**
	 * @deprecated
	 * 
	 * Creates a vertex with the given parameters
	 * Used when kind was a node attribute, now a property
	 * 
	 * @param attributes
	 *            The attributes of the vertex
	 * @return The created vertex
	 */
	public SDFAbstractVertex createVertex(
			HashMap<String, String> attributes) {
		String kind = attributes.get("kind");
		if (kind.equals(SDFVertex.VERTEX)) {
			SDFVertex newVertex = new SDFVertex();
			newVertex.setName("default");
			return newVertex;
		} else if (kind.equals(SDFInterfaceVertex.PORT)) {
			if (attributes.get(SDFInterfaceVertex.PORT_DIRECTION) != null) {
				if (attributes.get(SDFInterfaceVertex.PORT_DIRECTION).equals(
						InterfaceDirection.Input.name())) {
					return new SDFSourceInterfaceVertex();
				} else if (attributes.get(SDFInterfaceVertex.PORT_DIRECTION)
						.equals(InterfaceDirection.Output.name())) {
					return new SDFSinkInterfaceVertex();
				}
				return null;
			}
		} else if (kind.equals(SDFBroadcastVertex.BROADCAST)) {
			return new SDFBroadcastVertex();
		} else if (kind.equals(SDFRoundBufferVertex.ROUND_BUFFER)) {
			return new SDFRoundBufferVertex();
		} else if (kind.equals(SDFForkVertex.FORK)) {
			return new SDFForkVertex();
		} else if (kind.equals(SDFJoinVertex.JOIN)) {
			return new SDFJoinVertex();
		} else if (kind.equals(SDFInitVertex.INIT)) {
			return new SDFInitVertex();
		}
		return null;
	}

	public static SDFVertexFactory getInstance() {
		if(instance == null){
			instance = new SDFVertexFactory();
		}
		return instance;
	}



	@Override
	public SDFAbstractVertex createVertex(String kind) {
		// TODO Auto-generated method stub
		return null;
	}

}