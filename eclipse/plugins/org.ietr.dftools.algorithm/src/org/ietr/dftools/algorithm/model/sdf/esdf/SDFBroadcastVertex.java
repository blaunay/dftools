package org.ietr.dftools.algorithm.model.sdf.esdf;

import java.util.HashMap;
import java.util.Map;

import org.ietr.dftools.algorithm.model.AbstractEdge;
import org.ietr.dftools.algorithm.model.PropertySource;
import org.ietr.dftools.algorithm.model.parameters.InvalidExpressionException;
import org.ietr.dftools.algorithm.model.sdf.SDFAbstractVertex;
import org.ietr.dftools.algorithm.model.sdf.SDFEdge;
import org.ietr.dftools.algorithm.model.sdf.SDFInterfaceVertex;

/**
 * Special vertex that supports broadcast
 * 
 * @author jpiat
 * 
 */
public class SDFBroadcastVertex extends SDFAbstractVertex {

	/**
	 * Kind of node
	 */
	public static final String BROADCAST = "Broadcast";

	/**
	 * String to access the property edges order
	 */
	public static final String EDGES_ORDER = "edges_order";

	/**
	 * Creates a new SDFInterfaceVertex with the default direction (SINK)
	 */
	public SDFBroadcastVertex() {
		super();
		setKind(BROADCAST);
		setNbRepeat(1);
	}

	@Override
	public SDFAbstractVertex clone() {
		SDFBroadcastVertex copy = new SDFBroadcastVertex();
		copy.setName(this.getName());
		try {
			copy.setNbRepeat(this.getNbRepeat());
		} catch (InvalidExpressionException e) {
			e.printStackTrace();
		}

		// Copy the ports
		for (SDFInterfaceVertex sink : this.getSinks()) {
			if (copy.getGraphDescription() != null
					&& copy.getGraphDescription().getVertex(sink.getName()) != null) {
				copy.addSink((SDFInterfaceVertex) this.getGraphDescription()
						.getVertex(sink.getName()));
			} else {
				copy.addSink(sink.clone());
			}
		}
		for (SDFInterfaceVertex source : this.getSources()) {
			if (copy.getGraphDescription() != null
					&& copy.getGraphDescription().getVertex(source.getName()) != null) {
				copy.addSource((SDFInterfaceVertex) this.getGraphDescription()
						.getVertex(source.getName()));
			} else {
				copy.addSource(source.clone());
			}
		}

		return copy;
	}

	protected void addConnection(SDFEdge newEdge) {
		getConnections().put(getConnections().size(), newEdge);
	}

	private void removeConnection(SDFEdge newEdge) {
		Integer index = getEdgeIndex(newEdge);
		getConnections().remove(index);

		// update the indexes of remaining connections.
		for (int i = index; i < getConnections().size(); i++) {
			SDFEdge edge = getConnections().remove(i + 1);
			getConnections().put(i, edge);
		}
	}

	/**
	 * Swap two {@link SDFEdge} with given indexes in the ordered connection
	 * map.
	 * 
	 * @param index0
	 * @param index1
	 * @return <code>true</code> if both indices were valid and could be
	 *         swapped, <code>false</code> otherwise.
	 */
	public boolean swapEdges(int index0, int index1) {
		Map<Integer, SDFEdge> connections = getConnections();
		if (connections.containsKey(index0) && connections.containsKey(index1)) {
			SDFEdge buffer = connections.get(index0);
			connections.replace(index0, connections.get(index1));
			connections.replace(index1, buffer);
			return true;
		}

		return false;
	}

	/**
	 * Remove the given {@link SDFEdge} from its current index and insert it
	 * just before the {@link SDFEdge} currently at the given index (or at the
	 * end of the list if index == connections.size).
	 * 
	 * @param edge
	 *            the {@link SDFEdge} to move
	 * @param index
	 *            the new index for the {@link SDFEdge}
	 * @return <code>true</code> if the edge was found and moved at an existing
	 *         index, <code>false</code> otherwise.
	 */
	public boolean setEdgeIndex(SDFEdge edge, int index) {
		Map<Integer, SDFEdge> connections = getConnections();
		if (index < connections.size() && connections.containsValue(edge)) {
			int oldIndex = getEdgeIndex(edge);
			removeConnection(edge);
			index = (oldIndex < index) ? index - 1 : index;
			// update the indexes of subsequent edges.
			for (int i = connections.size() -1 ; i >= index ; i--) {
				connections.put(i + 1, connections.remove(i));
			}
			// put the edge in it new place
			connections.put(index, edge);
			return true;
		}

		// Special case, put the edge at the end
		if (index == connections.size() && connections.containsValue(edge)) {
			removeConnection(edge);
			addConnection(edge);
			return true;
		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void connectionAdded(AbstractEdge e) {
		addConnection((SDFEdge) e);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void connectionRemoved(AbstractEdge e) {
		removeConnection((SDFEdge) e);
	}

	/**
	 * Gives the edge connection index
	 * 
	 * @param edge
	 *            The edge to get the connection index
	 * @return The connection index of the edge
	 */
	public Integer getEdgeIndex(SDFEdge edge) {
		for (Integer idx : getConnections().keySet()) {
			if (getConnections().get(idx).equals(edge)) {
				return idx;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	protected Map<Integer, SDFEdge> getConnections() {
		Map<Integer, SDFEdge> connections;
		if ((connections = (Map<Integer, SDFEdge>) this.getPropertyBean()
				.getValue(EDGES_ORDER)) == null) {
			connections = new HashMap<Integer, SDFEdge>();
			this.getPropertyBean().setValue(EDGES_ORDER, connections);
		}
		return connections;
	}

	@Override
	public void copyProperties(PropertySource props) {
		super.copyProperties(props);
		Map<SDFEdge, Integer> connections = new HashMap<SDFEdge, Integer>();
		this.getPropertyBean().setValue(EDGES_ORDER, connections);
	}

}
