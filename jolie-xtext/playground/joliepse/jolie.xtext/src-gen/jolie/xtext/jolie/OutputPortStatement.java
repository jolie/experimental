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
 * A representation of the model object '<em><b>Output Port Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.OutputPortStatement#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.OutputPortStatement#getLocation <em>Location</em>}</li>
 *   <li>{@link jolie.xtext.jolie.OutputPortStatement#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link jolie.xtext.jolie.OutputPortStatement#getOneWayOperation <em>One Way Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.OutputPortStatement#getRequestResponseOperation <em>Request Response Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.OutputPortStatement#getIntefaces <em>Intefaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement()
 * @model
 * @generated
 */
public interface OutputPortStatement extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.OutputPortStatement#getName <em>Name</em>}' attribute.
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
   * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement_Location()
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
   * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement_Protocol()
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
   * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement_OneWayOperation()
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
   * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement_RequestResponseOperation()
   * @model containment="true"
   * @generated
   */
  EList<RequestResponseOperation> getRequestResponseOperation();

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
   * @see jolie.xtext.jolie.JoliePackage#getOutputPortStatement_Intefaces()
   * @model containment="true"
   * @generated
   */
  EList<Interfaces> getIntefaces();

} // OutputPortStatement
