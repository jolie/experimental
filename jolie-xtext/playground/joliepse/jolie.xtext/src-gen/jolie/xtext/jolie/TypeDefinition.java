/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.TypeDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference list.
   * @see jolie.xtext.jolie.JoliePackage#getTypeDefinition_Type()
   * @model
   * @generated
   */
  EList<Type> getType();

} // TypeDefinition
