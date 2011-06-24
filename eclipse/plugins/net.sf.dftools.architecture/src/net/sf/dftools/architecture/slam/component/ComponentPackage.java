/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.dftools.architecture.slam.component;

import net.sf.dftools.architecture.slam.SlamPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.dftools.architecture.slam.component.ComponentFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.dftools/architecture/slam/component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VLNV = SlamPackage.VLN_VED_ELEMENT__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETERS = SlamPackage.VLN_VED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACES = SlamPackage.VLN_VED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INSTANCES = SlamPackage.VLN_VED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFINEMENT = SlamPackage.VLN_VED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = SlamPackage.VLN_VED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.OperatorImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__VLNV = COMPONENT__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PARAMETERS = COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INTERFACES = COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INSTANCES = COMPONENT__INSTANCES;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__REFINEMENT = COMPONENT__REFINEMENT;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.ComNodeImpl <em>Com Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.ComNodeImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getComNode()
	 * @generated
	 */
	int COM_NODE = 2;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_NODE__VLNV = COMPONENT__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_NODE__PARAMETERS = COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_NODE__INTERFACES = COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_NODE__INSTANCES = COMPONENT__INSTANCES;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_NODE__REFINEMENT = COMPONENT__REFINEMENT;

	/**
	 * The number of structural features of the '<em>Com Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_NODE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.EnablerImpl <em>Enabler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.EnablerImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getEnabler()
	 * @generated
	 */
	int ENABLER = 3;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__VLNV = COMPONENT__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__PARAMETERS = COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__INTERFACES = COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__INSTANCES = COMPONENT__INSTANCES;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__REFINEMENT = COMPONENT__REFINEMENT;

	/**
	 * The number of structural features of the '<em>Enabler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.DmaImpl <em>Dma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.DmaImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getDma()
	 * @generated
	 */
	int DMA = 4;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMA__VLNV = ENABLER__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMA__PARAMETERS = ENABLER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMA__INTERFACES = ENABLER__INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMA__INSTANCES = ENABLER__INSTANCES;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMA__REFINEMENT = ENABLER__REFINEMENT;

	/**
	 * The number of structural features of the '<em>Dma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMA_FEATURE_COUNT = ENABLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.RamImpl <em>Ram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.RamImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getRam()
	 * @generated
	 */
	int RAM = 5;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__VLNV = ENABLER__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__PARAMETERS = ENABLER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__INTERFACES = ENABLER__INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__INSTANCES = ENABLER__INSTANCES;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__REFINEMENT = ENABLER__REFINEMENT;

	/**
	 * The number of structural features of the '<em>Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_FEATURE_COUNT = ENABLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.HierarchyPortImpl <em>Hierarchy Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.HierarchyPortImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getHierarchyPort()
	 * @generated
	 */
	int HIERARCHY_PORT = 6;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__VLNV = COMPONENT__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__PARAMETERS = COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__INTERFACES = COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__INSTANCES = COMPONENT__INSTANCES;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__REFINEMENT = COMPONENT__REFINEMENT;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__EXTERNAL_INTERFACE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__INTERNAL_INTERFACE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT__INTERNAL_COMPONENT_INSTANCE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hierarchy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_PORT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.component.impl.ComInterfaceImpl <em>Com Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.component.impl.ComInterfaceImpl
	 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getComInterface()
	 * @generated
	 */
	int COM_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__BUS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Abstraction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__ABSTRACTION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Com Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.dftools.architecture.slam.component.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Component#getInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.dftools.architecture.slam.component.Component#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Component#getInstances()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Instances();

	/**
	 * Returns the meta object for the reference '{@link net.sf.dftools.architecture.slam.component.Component#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refinement</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Component#getRefinement()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Refinement();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.ComNode <em>Com Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Node</em>'.
	 * @see net.sf.dftools.architecture.slam.component.ComNode
	 * @generated
	 */
	EClass getComNode();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.Enabler <em>Enabler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabler</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Enabler
	 * @generated
	 */
	EClass getEnabler();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.Dma <em>Dma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dma</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Dma
	 * @generated
	 */
	EClass getDma();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.Ram <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ram</em>'.
	 * @see net.sf.dftools.architecture.slam.component.Ram
	 * @generated
	 */
	EClass getRam();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.HierarchyPort <em>Hierarchy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Port</em>'.
	 * @see net.sf.dftools.architecture.slam.component.HierarchyPort
	 * @generated
	 */
	EClass getHierarchyPort();

	/**
	 * Returns the meta object for the reference '{@link net.sf.dftools.architecture.slam.component.HierarchyPort#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Interface</em>'.
	 * @see net.sf.dftools.architecture.slam.component.HierarchyPort#getExternalInterface()
	 * @see #getHierarchyPort()
	 * @generated
	 */
	EReference getHierarchyPort_ExternalInterface();

	/**
	 * Returns the meta object for the reference '{@link net.sf.dftools.architecture.slam.component.HierarchyPort#getInternalInterface <em>Internal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Interface</em>'.
	 * @see net.sf.dftools.architecture.slam.component.HierarchyPort#getInternalInterface()
	 * @see #getHierarchyPort()
	 * @generated
	 */
	EReference getHierarchyPort_InternalInterface();

	/**
	 * Returns the meta object for the reference '{@link net.sf.dftools.architecture.slam.component.HierarchyPort#getInternalComponentInstance <em>Internal Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Component Instance</em>'.
	 * @see net.sf.dftools.architecture.slam.component.HierarchyPort#getInternalComponentInstance()
	 * @see #getHierarchyPort()
	 * @generated
	 */
	EReference getHierarchyPort_InternalComponentInstance();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.component.ComInterface <em>Com Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Interface</em>'.
	 * @see net.sf.dftools.architecture.slam.component.ComInterface
	 * @generated
	 */
	EClass getComInterface();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.dftools.architecture.slam.component.ComInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see net.sf.dftools.architecture.slam.component.ComInterface#getComponent()
	 * @see #getComInterface()
	 * @generated
	 */
	EReference getComInterface_Component();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.dftools.architecture.slam.component.ComInterface#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Type</em>'.
	 * @see net.sf.dftools.architecture.slam.component.ComInterface#getBusType()
	 * @see #getComInterface()
	 * @generated
	 */
	EReference getComInterface_BusType();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.dftools.architecture.slam.component.ComInterface#getAbstractionType <em>Abstraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstraction Type</em>'.
	 * @see net.sf.dftools.architecture.slam.component.ComInterface#getAbstractionType()
	 * @see #getComInterface()
	 * @generated
	 */
	EReference getComInterface_AbstractionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INSTANCES = eINSTANCE.getComponent_Instances();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFINEMENT = eINSTANCE.getComponent_Refinement();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.OperatorImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.ComNodeImpl <em>Com Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.ComNodeImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getComNode()
		 * @generated
		 */
		EClass COM_NODE = eINSTANCE.getComNode();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.EnablerImpl <em>Enabler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.EnablerImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getEnabler()
		 * @generated
		 */
		EClass ENABLER = eINSTANCE.getEnabler();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.DmaImpl <em>Dma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.DmaImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getDma()
		 * @generated
		 */
		EClass DMA = eINSTANCE.getDma();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.RamImpl <em>Ram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.RamImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getRam()
		 * @generated
		 */
		EClass RAM = eINSTANCE.getRam();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.HierarchyPortImpl <em>Hierarchy Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.HierarchyPortImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getHierarchyPort()
		 * @generated
		 */
		EClass HIERARCHY_PORT = eINSTANCE.getHierarchyPort();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_PORT__EXTERNAL_INTERFACE = eINSTANCE.getHierarchyPort_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Internal Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_PORT__INTERNAL_INTERFACE = eINSTANCE.getHierarchyPort_InternalInterface();

		/**
		 * The meta object literal for the '<em><b>Internal Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_PORT__INTERNAL_COMPONENT_INSTANCE = eINSTANCE.getHierarchyPort_InternalComponentInstance();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.component.impl.ComInterfaceImpl <em>Com Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.component.impl.ComInterfaceImpl
		 * @see net.sf.dftools.architecture.slam.component.impl.ComponentPackageImpl#getComInterface()
		 * @generated
		 */
		EClass COM_INTERFACE = eINSTANCE.getComInterface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_INTERFACE__COMPONENT = eINSTANCE.getComInterface_Component();

		/**
		 * The meta object literal for the '<em><b>Bus Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_INTERFACE__BUS_TYPE = eINSTANCE.getComInterface_BusType();

		/**
		 * The meta object literal for the '<em><b>Abstraction Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_INTERFACE__ABSTRACTION_TYPE = eINSTANCE.getComInterface_AbstractionType();

	}

} //ComponentPackage