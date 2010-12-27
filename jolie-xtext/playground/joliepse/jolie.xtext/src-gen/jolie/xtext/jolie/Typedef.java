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
 * A representation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Typedef#getSubtypes <em>Subtypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getTypedef()
 * @model
 * @generated
 */
public interface Typedef extends EObject
{
  /**
   * Returns the value of the '<em><b>Subtypes</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Subtypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtypes</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getTypedef_Subtypes()
   * @model containment="true"
   * @generated
   */
  EList<Subtypes> getSubtypes();

} // Typedef
