/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Redirects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redirects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.RedirectsImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.RedirectsImpl#getOutputPortIdentifier <em>Output Port Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedirectsImpl extends MinimalEObjectImpl.Container implements Redirects
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * The cached value of the '{@link #getOutputPortIdentifier() <em>Output Port Identifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPortIdentifier()
   * @generated
   * @ordered
   */
  protected EList<String> outputPortIdentifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RedirectsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JoliePackage.Literals.REDIRECTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, JoliePackage.REDIRECTS__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOutputPortIdentifier()
  {
    if (outputPortIdentifier == null)
    {
      outputPortIdentifier = new EDataTypeEList<String>(String.class, this, JoliePackage.REDIRECTS__OUTPUT_PORT_IDENTIFIER);
    }
    return outputPortIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JoliePackage.REDIRECTS__NAME:
        return getName();
      case JoliePackage.REDIRECTS__OUTPUT_PORT_IDENTIFIER:
        return getOutputPortIdentifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoliePackage.REDIRECTS__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.REDIRECTS__OUTPUT_PORT_IDENTIFIER:
        getOutputPortIdentifier().clear();
        getOutputPortIdentifier().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JoliePackage.REDIRECTS__NAME:
        getName().clear();
        return;
      case JoliePackage.REDIRECTS__OUTPUT_PORT_IDENTIFIER:
        getOutputPortIdentifier().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JoliePackage.REDIRECTS__NAME:
        return name != null && !name.isEmpty();
      case JoliePackage.REDIRECTS__OUTPUT_PORT_IDENTIFIER:
        return outputPortIdentifier != null && !outputPortIdentifier.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", outputPortIdentifier: ");
    result.append(outputPortIdentifier);
    result.append(')');
    return result.toString();
  }

} //RedirectsImpl
