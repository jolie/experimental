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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Interface#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Interface#getRequestResponseOperation <em>Request Response Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Interface#getOneWayOperation <em>One Way Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getInterface_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Request Response Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Response Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Response Operation</em>' containment reference.
   * @see #setRequestResponseOperation(RequestResponseOperation)
   * @see jolie.xtext.jolie.JoliePackage#getInterface_RequestResponseOperation()
   * @model containment="true"
   * @generated
   */
  RequestResponseOperation getRequestResponseOperation();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Interface#getRequestResponseOperation <em>Request Response Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Response Operation</em>' containment reference.
   * @see #getRequestResponseOperation()
   * @generated
   */
  void setRequestResponseOperation(RequestResponseOperation value);

  /**
   * Returns the value of the '<em><b>One Way Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Way Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Way Operation</em>' containment reference.
   * @see #setOneWayOperation(OneWayOperation)
   * @see jolie.xtext.jolie.JoliePackage#getInterface_OneWayOperation()
   * @model containment="true"
   * @generated
   */
  OneWayOperation getOneWayOperation();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Interface#getOneWayOperation <em>One Way Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One Way Operation</em>' containment reference.
   * @see #getOneWayOperation()
   * @generated
   */
  void setOneWayOperation(OneWayOperation value);

} // Interface
