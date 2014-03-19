/* Copyright (c) 2010-2011 - IETR/INSA de Rennes and EPFL
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *   * Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *   * Neither the name of the IETR/INSA de Rennes and EPFL nor the names of its
 *     contributors may be used to endorse or promote products derived from this
 *     software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */
package org.ietr.dftools.architecture.component.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.ietr.dftools.architecture.VLNV;
import org.ietr.dftools.architecture.component.BusInterface;
import org.ietr.dftools.architecture.component.Component;
import org.ietr.dftools.architecture.component.ComponentFactory;
import org.ietr.dftools.architecture.design.Design;
import org.ietr.dftools.architecture.design.serialize.DesignParser;
import org.ietr.dftools.architecture.utils.DomUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * This class defines an IP-XACT parser.
 * 
 * @author Ghislain Roquier
 * 
 */
public class ComponentParser {

	private IFile file;

	private String name;

	private HashMap<String, BusInterface> busInterfaces;

	private Design subDesign;

	private String componentType;

	private HashMap<String, String> options;

	public ComponentParser(IFile file) {
		this.file = file;
	}

	public Component parse() throws Exception {
		try {
			InputStream is = file.getContents();
			Document document = DomUtil.parseDocument(is);
			Component component = parseComponent(document);
			is.close();
			return component;
		} catch (IOException e) {
			throw new IOException("I/O error when parsing component", e);
		}
	}

	private void parseBusInterface(Element element) {
		Node node = element.getFirstChild();
		String name = null;
		String vendor = null;
		String library = null;
		String busName = null;
		String version = null;

		boolean isServer = false;
		while (node != null) {
			if (node instanceof Element) {
				Element elt = (Element) node;
				String type = elt.getTagName();
				if (type.equals("spirit:name")) {
					name = elt.getTextContent();
				} else if (type.equals("spirit:busType")) {
					vendor = element.getAttribute("spirit:vendor");
					library = element.getAttribute("spirit:library");
					busName = element.getAttribute("spirit:name");
					version = element.getAttribute("spirit:version");
				} else if (type.equals("spirit:master")) {
					isServer = true;
				} else if (type.equals("spirit:slave")) {
					isServer = false;
				}
			}
			node = node.getNextSibling();
		}

		busInterfaces.put(name, new BusInterface(name, new VLNV(vendor,
				library, busName, version), isServer));
	}

	private void parseBusInterfaces(Element buses) {
		Node node = buses.getFirstChild();
		while (node != null) {
			if (node instanceof Element) {
				Element element = (Element) node;
				String type = element.getTagName();
				if (type.equals("spirit:busInterface")) {
					parseBusInterface(element);
				}
			}
			node = node.getNextSibling();
		}
	}

	private Component parseComponent(Document doc) throws Exception {
		Element root = doc.getDocumentElement();
		Node node = root.getFirstChild();
		busInterfaces = new HashMap<String, BusInterface>();
		options = new HashMap<String, String>();

		String vendor = null;
		String library = null;
		String version = null;

		while (node != null) {
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String nodeName = node.getNodeName();
				if (nodeName.equals("spirit:vendor")) {
					vendor = element.getTextContent();
				} else if (nodeName.equals("spirit:name")) {
					name = element.getTextContent();
				} else if (nodeName.equals("spirit:library")) {
					library = element.getTextContent();
				} else if (nodeName.equals("spirit:version")) {
					version = element.getTextContent();
				} else if (nodeName.equals("spirit:busInterfaces")) {
					parseBusInterfaces(element);
				} else if (nodeName.equals("spirit:model")) {
					parseSubDesign(element);
				} else if (nodeName.equals("spirit:vendorExtensions")) {
					parseComponentType(element);
				} else {
					// manage exception;
				}
			}
			node = node.getNextSibling();
		}
		VLNV vlnv = new VLNV(vendor, library, name, version);
		return ComponentFactory.getInstance().createComponent(componentType,
				vlnv, busInterfaces, subDesign, options);
	}

	private void parseComponentType(Element element) {
		Node node = element.getFirstChild();

		while (node != null) {

			if (node instanceof Element) {
				Element elt = (Element) node;
				String eltType = elt.getTagName();
				if (eltType.equals("componentType")) {
					componentType = elt.getAttribute("kind");

					if (componentType.equals("operator")) {
						parseOperatorType(elt);
					}
				}
			}
			node = node.getNextSibling();
		}

	}

	private void parseOperatorType(Element element) {
		Node node = element.getFirstChild();

		while (node != null) {

			if (node instanceof Element) {
				Element elt = (Element) node;
				String eltType = elt.getTagName();
				if (eltType.equals("operatorType")) {
					String operatorType = elt.getAttribute("kind");
					options.put("operatorType", operatorType);
					if ("fpga".equals(operatorType)) {
						options.put("fpgaType", elt.getAttribute("part"));
					}
				}
			}
			node = node.getNextSibling();
		}
	}

	private void parseSubDesign(Element callElt) throws Exception {

		Node node = callElt.getFirstChild();

		while (node != null) {

			if (node instanceof Element) {
				Element elt = (Element) node;
				String eltType = elt.getTagName();
				if (eltType.equals("spirit:views")) {
					parseSubDesignViews(elt);
				}
			}
			node = node.getNextSibling();
		}
	}

	/**
	 * Parses a subdesign view
	 * 
	 * @throws Exception
	 */
	private void parseSubDesignViews(Element callElt) throws Exception {

		Node node = callElt.getFirstChild();

		while (node != null) {

			if (node instanceof Element) {
				Element elt = (Element) node;
				String eltType = elt.getTagName();
				if (eltType.equals("spirit:view")) {
					parseView(elt);
					// Only the first found view is parsed
					break;
				}
			}
			node = node.getNextSibling();
		}
	}

	/**
	 * Parses a subdesign of the current component and sets it as the component
	 * refinement
	 * 
	 * @throws Exception
	 */
	private void parseView(Element element) throws Exception {

		String designName = null;
		Node node = element.getFirstChild();

		while (node != null) {

			if (node instanceof Element) {
				Element elt = (Element) node;
				String eltType = elt.getTagName();
				if (eltType.equals("spirit:hierarchyRef")) {
					designName = elt.getAttribute("spirit:name");
				}
			}
			node = node.getNextSibling();
		}

		try {
			IFolder path = (IFolder) file.getParent();
			IFile designFile = path.getFile(designName + ".dsn");
			DesignParser parser = new DesignParser(designFile);
			subDesign = parser.parse();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}