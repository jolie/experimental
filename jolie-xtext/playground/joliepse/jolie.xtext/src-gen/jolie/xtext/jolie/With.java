/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.With#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.With#getMainrocess <em>Mainrocess</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getWith()
 * @model
 * @generated
 */
public interface With extends BasicStatement
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
   * @see jolie.xtext.jolie.JoliePackage#getWith_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Mainrocess</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.MainProcess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mainrocess</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mainrocess</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getWith_Mainrocess()
   * @model containment="true"
   * @generated
   */
  EList<MainProcess> getMainrocess();

} // With
