/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtypes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Subtypes#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Subtypes#getNative_type_sub <em>Native type sub</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Subtypes#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getSubtypes()
 * @model
 * @generated
 */
public interface Subtypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see jolie.xtext.jolie.JoliePackage#getSubtypes_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Native type sub</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Native_type_sub}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Native type sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Native type sub</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getSubtypes_Native_type_sub()
   * @model containment="true"
   * @generated
   */
  EList<Native_type_sub> getNative_type_sub();

  /**
   * Returns the value of the '<em><b>Typedef</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Typedef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedef</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedef</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getSubtypes_Typedef()
   * @model containment="true"
   * @generated
   */
  EList<Typedef> getTypedef();

} // Subtypes
