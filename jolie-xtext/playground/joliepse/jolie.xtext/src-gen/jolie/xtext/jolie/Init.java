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
 * A representation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Init#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Init#getMainrocess <em>Mainrocess</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getInit()
 * @model
 * @generated
 */
public interface Init extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getInit_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mainrocess</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mainrocess</em>' containment reference.
   * @see #setMainrocess(MainProcess)
   * @see jolie.xtext.jolie.JoliePackage#getInit_Mainrocess()
   * @model containment="true"
   * @generated
   */
  MainProcess getMainrocess();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Init#getMainrocess <em>Mainrocess</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mainrocess</em>' containment reference.
   * @see #getMainrocess()
   * @generated
   */
  void setMainrocess(MainProcess value);

} // Init
