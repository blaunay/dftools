/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.dftools.architecture.slam;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see net.sf.dftools.architecture.slam.SlamFactory
 * @model kind="package"
 * @generated
 */
public interface SlamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.dftools/architecture/slam";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlamPackage eINSTANCE = net.sf.dftools.architecture.slam.impl.SlamPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.impl.VLNVedElementImpl <em>VLN Ved Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.impl.VLNVedElementImpl
	 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getVLNVedElement()
	 * @generated
	 */
	int VLN_VED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLN_VED_ELEMENT__VLNV = 0;

	/**
	 * The number of structural features of the '<em>VLN Ved Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLN_VED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.impl.DesignImpl
	 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 0;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__VLNV = VLN_VED_ELEMENT__VLNV;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__COMPONENT_INSTANCES = VLN_VED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__LINKS = VLN_VED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = VLN_VED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.impl.ComponentInstanceImpl
	 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Vlnv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__VLNV = VLN_VED_ELEMENT__VLNV;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PARAMETERS = VLN_VED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT = VLN_VED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INSTANCE_NAME = VLN_VED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = VLN_VED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.dftools.architecture.slam.impl.ParameterizedElementImpl <em>Parameterized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.architecture.slam.impl.ParameterizedElementImpl
	 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getParameterizedElement()
	 * @generated
	 */
	int PARAMETERIZED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameterized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see net.sf.dftools.architecture.slam.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.dftools.architecture.slam.Design#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Instances</em>'.
	 * @see net.sf.dftools.architecture.slam.Design#getComponentInstances()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_ComponentInstances();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.dftools.architecture.slam.Design#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see net.sf.dftools.architecture.slam.Design#getLinks()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Links();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see net.sf.dftools.architecture.slam.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.dftools.architecture.slam.ComponentInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see net.sf.dftools.architecture.slam.ComponentInstance#getComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Component();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.dftools.architecture.slam.ComponentInstance#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see net.sf.dftools.architecture.slam.ComponentInstance#getInstanceName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_InstanceName();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.VLNVedElement <em>VLN Ved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLN Ved Element</em>'.
	 * @see net.sf.dftools.architecture.slam.VLNVedElement
	 * @generated
	 */
	EClass getVLNVedElement();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.dftools.architecture.slam.VLNVedElement#getVlnv <em>Vlnv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vlnv</em>'.
	 * @see net.sf.dftools.architecture.slam.VLNVedElement#getVlnv()
	 * @see #getVLNVedElement()
	 * @generated
	 */
	EReference getVLNVedElement_Vlnv();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.architecture.slam.ParameterizedElement <em>Parameterized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Element</em>'.
	 * @see net.sf.dftools.architecture.slam.ParameterizedElement
	 * @generated
	 */
	EClass getParameterizedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.dftools.architecture.slam.ParameterizedElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see net.sf.dftools.architecture.slam.ParameterizedElement#getParameters()
	 * @see #getParameterizedElement()
	 * @generated
	 */
	EReference getParameterizedElement_Parameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlamFactory getSlamFactory();

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
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.impl.DesignImpl
		 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__COMPONENT_INSTANCES = eINSTANCE.getDesign_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__LINKS = eINSTANCE.getDesign_Links();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.impl.ComponentInstanceImpl
		 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__INSTANCE_NAME = eINSTANCE.getComponentInstance_InstanceName();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.impl.VLNVedElementImpl <em>VLN Ved Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.impl.VLNVedElementImpl
		 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getVLNVedElement()
		 * @generated
		 */
		EClass VLN_VED_ELEMENT = eINSTANCE.getVLNVedElement();

		/**
		 * The meta object literal for the '<em><b>Vlnv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VLN_VED_ELEMENT__VLNV = eINSTANCE.getVLNVedElement_Vlnv();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.architecture.slam.impl.ParameterizedElementImpl <em>Parameterized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.architecture.slam.impl.ParameterizedElementImpl
		 * @see net.sf.dftools.architecture.slam.impl.SlamPackageImpl#getParameterizedElement()
		 * @generated
		 */
		EClass PARAMETERIZED_ELEMENT = eINSTANCE.getParameterizedElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_ELEMENT__PARAMETERS = eINSTANCE.getParameterizedElement_Parameters();

	}

} //SlamPackage