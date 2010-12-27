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
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Program#getInclude <em>Include</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getPorts <em>Ports</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getInterface <em>Interface</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getTypes <em>Types</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getInit <em>Init</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getExecution <em>Execution</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getDefine <em>Define</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Program#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Include</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Include}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Include()
   * @model containment="true"
   * @generated
   */
  EList<Include> getInclude();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Interface()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getInterface();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Init}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Init()
   * @model containment="true"
   * @generated
   */
  EList<Init> getInit();

  /**
   * Returns the value of the '<em><b>Execution</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution</em>' attribute list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Execution()
   * @model unique="false"
   * @generated
   */
  EList<String> getExecution();

  /**
   * Returns the value of the '<em><b>Define</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Define}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Define</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Define()
   * @model containment="true"
   * @generated
   */
  EList<Define> getDefine();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see jolie.xtext.jolie.JoliePackage#getProgram_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Program#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

} // Program
