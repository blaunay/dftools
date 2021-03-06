package org.ietr.dftools.algorithm.exporter;

/**
 * Class describing a GML key
 * 
 * @author jpiat
 * 
 */
public class Key {
	String applyTo;
	Class<?> desc;
	String id;
	String name;
	String type;

	/**
	 * Construct a new key with the given name, applyint to instanceof the class
	 * "applyTo" and with a value of the type "type". The last parameter is a
	 * description of the key meaning
	 * 
	 * @param name
	 *            The key name
	 * @param applyTo
	 *            The type of element this key apply to (node, edge, port ...)
	 * @param type
	 *            The type of the value of this key (string, int, double)
	 * @param desc
	 *            The class name of the properties value (SDFEdgePorperty.class)
	 *            ...
	 */
	public Key(String name, String applyTo, String type, Class<?> desc) {
		this.name = name;
		this.type = type;
		this.applyTo = applyTo;
		this.desc = desc;
	}

	/**
	 * Gives a string representation of the class this key applies to
	 * 
	 * @return Gives the Class name it applies to
	 */
	public String getApplyTo() {
		return applyTo;
	}

	/**
	 * Gives this key id
	 * 
	 * @return The id of the key
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gives this key's name
	 * 
	 * @return The name of this key
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gives a String representation of the type of this key
	 * 
	 * @return The STring representation of this key type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Gives the description of this key
	 * 
	 * @return The description of this key
	 */
	public Class<?> getTypeClass() {
		return desc;
	}

	/**
	 * Sets this key d
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object key) {
		if (key instanceof Key) {
			Key kKey = (Key) key;
			// Since when it exists, the id is always equal to the name, we remove
			// the equality test for this.id
			// @author Karol Desnos
			// @date 2012.10.17
			return kKey.applyTo.equals(this.applyTo)
					&& kKey.name.equals(this.name)
					&& kKey.type.equals(this.type);
		}
		return false;
	}
}
