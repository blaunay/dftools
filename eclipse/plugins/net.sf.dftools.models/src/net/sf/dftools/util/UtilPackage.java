/**
 */
package net.sf.dftools.util;

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
 * @see net.sf.dftools.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dftools.sf.net/model/2012/Util";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.sf.dftools.util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilPackage eINSTANCE = net.sf.dftools.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.dftools.util.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.util.impl.AttributeImpl
	 * @see net.sf.dftools.util.impl.UtilPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contained Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Pojo Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__POJO_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Referenced Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REFERENCED_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.dftools.util.impl.NameableImpl <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.util.impl.NameableImpl
	 * @see net.sf.dftools.util.impl.UtilPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.dftools.util.impl.WrapperStringImpl <em>Wrapper String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.util.impl.WrapperStringImpl
	 * @see net.sf.dftools.util.impl.UtilPackageImpl#getWrapperString()
	 * @generated
	 */
	int WRAPPER_STRING = 2;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER_STRING__STRING = 0;

	/**
	 * The number of structural features of the '<em>Wrapper String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER_STRING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.dftools.util.impl.WrapperXmlImpl <em>Wrapper Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.util.impl.WrapperXmlImpl
	 * @see net.sf.dftools.util.impl.UtilPackageImpl#getWrapperXml()
	 * @generated
	 */
	int WRAPPER_XML = 3;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER_XML__XML = 0;

	/**
	 * The number of structural features of the '<em>Wrapper Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER_XML_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.dftools.util.impl.AttributableImpl <em>Attributable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.dftools.util.impl.AttributableImpl
	 * @see net.sf.dftools.util.impl.UtilPackageImpl#getAttributable()
	 * @generated
	 */
	int ATTRIBUTABLE = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.util.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see net.sf.dftools.util.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.dftools.util.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.dftools.util.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.dftools.util.Attribute#getContainedValue <em>Contained Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Value</em>'.
	 * @see net.sf.dftools.util.Attribute#getContainedValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ContainedValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.dftools.util.Attribute#getPojoValue <em>Pojo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pojo Value</em>'.
	 * @see net.sf.dftools.util.Attribute#getPojoValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_PojoValue();

	/**
	 * Returns the meta object for the reference '{@link net.sf.dftools.util.Attribute#getReferencedValue <em>Referenced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Value</em>'.
	 * @see net.sf.dftools.util.Attribute#getReferencedValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ReferencedValue();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.util.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see net.sf.dftools.util.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.dftools.util.Nameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.dftools.util.Nameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.util.WrapperString <em>Wrapper String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapper String</em>'.
	 * @see net.sf.dftools.util.WrapperString
	 * @generated
	 */
	EClass getWrapperString();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.dftools.util.WrapperString#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see net.sf.dftools.util.WrapperString#getString()
	 * @see #getWrapperString()
	 * @generated
	 */
	EAttribute getWrapperString_String();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.util.WrapperXml <em>Wrapper Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapper Xml</em>'.
	 * @see net.sf.dftools.util.WrapperXml
	 * @generated
	 */
	EClass getWrapperXml();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.dftools.util.WrapperXml#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml</em>'.
	 * @see net.sf.dftools.util.WrapperXml#getXml()
	 * @see #getWrapperXml()
	 * @generated
	 */
	EAttribute getWrapperXml_Xml();

	/**
	 * Returns the meta object for class '{@link net.sf.dftools.util.Attributable <em>Attributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributable</em>'.
	 * @see net.sf.dftools.util.Attributable
	 * @generated
	 */
	EClass getAttributable();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.dftools.util.Attributable#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see net.sf.dftools.util.Attributable#getAttributes()
	 * @see #getAttributable()
	 * @generated
	 */
	EReference getAttributable_Attributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

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
		 * The meta object literal for the '{@link net.sf.dftools.util.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.util.impl.AttributeImpl
		 * @see net.sf.dftools.util.impl.UtilPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Contained Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONTAINED_VALUE = eINSTANCE
				.getAttribute_ContainedValue();

		/**
		 * The meta object literal for the '<em><b>Pojo Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__POJO_VALUE = eINSTANCE.getAttribute_PojoValue();

		/**
		 * The meta object literal for the '<em><b>Referenced Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__REFERENCED_VALUE = eINSTANCE
				.getAttribute_ReferencedValue();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.util.impl.NameableImpl <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.util.impl.NameableImpl
		 * @see net.sf.dftools.util.impl.UtilPackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE__NAME = eINSTANCE.getNameable_Name();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.util.impl.WrapperStringImpl <em>Wrapper String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.util.impl.WrapperStringImpl
		 * @see net.sf.dftools.util.impl.UtilPackageImpl#getWrapperString()
		 * @generated
		 */
		EClass WRAPPER_STRING = eINSTANCE.getWrapperString();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPER_STRING__STRING = eINSTANCE.getWrapperString_String();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.util.impl.WrapperXmlImpl <em>Wrapper Xml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.util.impl.WrapperXmlImpl
		 * @see net.sf.dftools.util.impl.UtilPackageImpl#getWrapperXml()
		 * @generated
		 */
		EClass WRAPPER_XML = eINSTANCE.getWrapperXml();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPER_XML__XML = eINSTANCE.getWrapperXml_Xml();

		/**
		 * The meta object literal for the '{@link net.sf.dftools.util.impl.AttributableImpl <em>Attributable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.dftools.util.impl.AttributableImpl
		 * @see net.sf.dftools.util.impl.UtilPackageImpl#getAttributable()
		 * @generated
		 */
		EClass ATTRIBUTABLE = eINSTANCE.getAttributable();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTABLE__ATTRIBUTES = eINSTANCE
				.getAttributable_Attributes();

	}

} //UtilPackage
