/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.util.Collection;

import jolie.xtext.jolie.InputPortStatement;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.OutputPortStatement;
import jolie.xtext.jolie.Port;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.PortImpl#getInputPortStatement <em>Input Port Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.PortImpl#getOutputPortStatement <em>Output Port Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port
{
  /**
   * The cached value of the '{@link #getInputPortStatement() <em>Input Port Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputPortStatement()
   * @generated
   * @ordered
   */
  protected EList<InputPortStatement> inputPortStatement;

  /**
   * The cached value of the '{@link #getOutputPortStatement() <em>Output Port Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPortStatement()
   * @generated
   * @ordered
   */
  protected EList<OutputPortStatement> outputPortStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
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
    return JoliePackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputPortStatement> getInputPortStatement()
  {
    if (inputPortStatement == null)
    {
      inputPortStatement = new EObjectContainmentEList<InputPortStatement>(InputPortStatement.class, this, JoliePackage.PORT__INPUT_PORT_STATEMENT);
    }
    return inputPortStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutputPortStatement> getOutputPortStatement()
  {
    if (outputPortStatement == null)
    {
      outputPortStatement = new EObjectContainmentEList<OutputPortStatement>(OutputPortStatement.class, this, JoliePackage.PORT__OUTPUT_PORT_STATEMENT);
    }
    return outputPortStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JoliePackage.PORT__INPUT_PORT_STATEMENT:
        return ((InternalEList<?>)getInputPortStatement()).basicRemove(otherEnd, msgs);
      case JoliePackage.PORT__OUTPUT_PORT_STATEMENT:
        return ((InternalEList<?>)getOutputPortStatement()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JoliePackage.PORT__INPUT_PORT_STATEMENT:
        return getInputPortStatement();
      case JoliePackage.PORT__OUTPUT_PORT_STATEMENT:
        return getOutputPortStatement();
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
      case JoliePackage.PORT__INPUT_PORT_STATEMENT:
        getInputPortStatement().clear();
        getInputPortStatement().addAll((Collection<? extends InputPortStatement>)newValue);
        return;
      case JoliePackage.PORT__OUTPUT_PORT_STATEMENT:
        getOutputPortStatement().clear();
        getOutputPortStatement().addAll((Collection<? extends OutputPortStatement>)newValue);
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
      case JoliePackage.PORT__INPUT_PORT_STATEMENT:
        getInputPortStatement().clear();
        return;
      case JoliePackage.PORT__OUTPUT_PORT_STATEMENT:
        getOutputPortStatement().clear();
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
      case JoliePackage.PORT__INPUT_PORT_STATEMENT:
        return inputPortStatement != null && !inputPortStatement.isEmpty();
      case JoliePackage.PORT__OUTPUT_PORT_STATEMENT:
        return outputPortStatement != null && !outputPortStatement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PortImpl
