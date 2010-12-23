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
 * A representation of the model object '<em><b>TYPEDEF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.TYPEDEF#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.TYPEDEF#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getTYPEDEF()
 * @model
 * @generated
 */
public interface TYPEDEF extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getTYPEDEF_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Typedef</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.TYPEDEF}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedef</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedef</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getTYPEDEF_Typedef()
   * @model containment="true"
   * @generated
   */
  EList<TYPEDEF> getTypedef();

} // TYPEDEF
