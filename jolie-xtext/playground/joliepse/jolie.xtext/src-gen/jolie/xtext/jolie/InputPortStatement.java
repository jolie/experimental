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
 * A representation of the model object '<em><b>Input Port Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getLocation <em>Location</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getOneWayOperation <em>One Way Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getRequestResponseOperation <em>Request Response Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getRedirects <em>Redirects</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InputPortStatement#getIntefaces <em>Intefaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement()
 * @model
 * @generated
 */
public interface InputPortStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.InputPortStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Location}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_Location()
   * @model containment="true"
   * @generated
   */
  EList<Location> getLocation();

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_Protocol()
   * @model containment="true"
   * @generated
   */
  EList<Protocol> getProtocol();

  /**
   * Returns the value of the '<em><b>One Way Operation</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.OneWayOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Way Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Way Operation</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_OneWayOperation()
   * @model containment="true"
   * @generated
   */
  EList<OneWayOperation> getOneWayOperation();

  /**
   * Returns the value of the '<em><b>Request Response Operation</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.RequestResponseOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Response Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Response Operation</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_RequestResponseOperation()
   * @model containment="true"
   * @generated
   */
  EList<RequestResponseOperation> getRequestResponseOperation();

  /**
   * Returns the value of the '<em><b>Redirects</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Redirects}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Redirects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Redirects</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_Redirects()
   * @model containment="true"
   * @generated
   */
  EList<Redirects> getRedirects();

  /**
   * Returns the value of the '<em><b>Aggregates</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Aggregates}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregates</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_Aggregates()
   * @model containment="true"
   * @generated
   */
  EList<Aggregates> getAggregates();

  /**
   * Returns the value of the '<em><b>Intefaces</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Interfaces}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intefaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intefaces</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInputPortStatement_Intefaces()
   * @model containment="true"
   * @generated
   */
  EList<Interfaces> getIntefaces();

} // InputPortStatement
