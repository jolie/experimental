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
 * A representation of the model object '<em><b>Request Response Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.RequestResponseOperation#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.RequestResponseOperation#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getRequestResponseOperation()
 * @model
 * @generated
 */
public interface RequestResponseOperation extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getRequestResponseOperation_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Type Definition</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getRequestResponseOperation_TypeDefinition()
   * @model containment="true"
   * @generated
   */
  EList<TypeDefinition> getTypeDefinition();

} // RequestResponseOperation
