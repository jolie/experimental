/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.VariablePath#getChildren <em>Children</em>}</li>
 *   <li>{@link jolie.xtext.jolie.VariablePath#getVariablePath <em>Variable Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getVariablePath()
 * @model
 * @generated
 */
public interface VariablePath extends InputOperation
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getVariablePath_Children()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getChildren();

  /**
   * Returns the value of the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Path</em>' containment reference.
   * @see #setVariablePath(VariablePath)
   * @see jolie.xtext.jolie.JoliePackage#getVariablePath_VariablePath()
   * @model containment="true"
   * @generated
   */
  VariablePath getVariablePath();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.VariablePath#getVariablePath <em>Variable Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Path</em>' containment reference.
   * @see #getVariablePath()
   * @generated
   */
  void setVariablePath(VariablePath value);

} // VariablePath
