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
 * A representation of the model object '<em><b>Redirects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Redirects#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Redirects#getOutputPortIdentifier <em>Output Port Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getRedirects()
 * @model
 * @generated
 */
public interface Redirects extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getRedirects_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Output Port Identifier</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Port Identifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Port Identifier</em>' attribute list.
   * @see jolie.xtext.jolie.JoliePackage#getRedirects_OutputPortIdentifier()
   * @model unique="false"
   * @generated
   */
  EList<String> getOutputPortIdentifier();

} // Redirects
