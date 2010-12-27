/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Undef#getVariablePath <em>Variable Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getUndef()
 * @model
 * @generated
 */
public interface Undef extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Variable Path</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.VariablePath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Path</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getUndef_VariablePath()
   * @model containment="true"
   * @generated
   */
  EList<VariablePath> getVariablePath();

} // Undef
