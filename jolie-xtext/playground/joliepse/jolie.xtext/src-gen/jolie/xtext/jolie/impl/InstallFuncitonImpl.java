/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.InstallFunciton;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.ParallelStatement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Install Funciton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.InstallFuncitonImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.InstallFuncitonImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.InstallFuncitonImpl#getParallelStatement <em>Parallel Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstallFuncitonImpl extends MinimalEObjectImpl.Container implements InstallFunciton
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
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected EList<jolie.xtext.jolie.Process> process;

  /**
   * The cached value of the '{@link #getParallelStatement() <em>Parallel Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParallelStatement()
   * @generated
   * @ordered
   */
  protected EList<ParallelStatement> parallelStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstallFuncitonImpl()
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
    return JoliePackage.Literals.INSTALL_FUNCITON;
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
      name = new EDataTypeEList<String>(String.class, this, JoliePackage.INSTALL_FUNCITON__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<jolie.xtext.jolie.Process> getProcess()
  {
    if (process == null)
    {
      process = new EObjectContainmentEList<jolie.xtext.jolie.Process>(jolie.xtext.jolie.Process.class, this, JoliePackage.INSTALL_FUNCITON__PROCESS);
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParallelStatement> getParallelStatement()
  {
    if (parallelStatement == null)
    {
      parallelStatement = new EObjectContainmentEList<ParallelStatement>(ParallelStatement.class, this, JoliePackage.INSTALL_FUNCITON__PARALLEL_STATEMENT);
    }
    return parallelStatement;
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
      case JoliePackage.INSTALL_FUNCITON__PROCESS:
        return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
      case JoliePackage.INSTALL_FUNCITON__PARALLEL_STATEMENT:
        return ((InternalEList<?>)getParallelStatement()).basicRemove(otherEnd, msgs);
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
      case JoliePackage.INSTALL_FUNCITON__NAME:
        return getName();
      case JoliePackage.INSTALL_FUNCITON__PROCESS:
        return getProcess();
      case JoliePackage.INSTALL_FUNCITON__PARALLEL_STATEMENT:
        return getParallelStatement();
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
      case JoliePackage.INSTALL_FUNCITON__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.INSTALL_FUNCITON__PROCESS:
        getProcess().clear();
        getProcess().addAll((Collection<? extends jolie.xtext.jolie.Process>)newValue);
        return;
      case JoliePackage.INSTALL_FUNCITON__PARALLEL_STATEMENT:
        getParallelStatement().clear();
        getParallelStatement().addAll((Collection<? extends ParallelStatement>)newValue);
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
      case JoliePackage.INSTALL_FUNCITON__NAME:
        getName().clear();
        return;
      case JoliePackage.INSTALL_FUNCITON__PROCESS:
        getProcess().clear();
        return;
      case JoliePackage.INSTALL_FUNCITON__PARALLEL_STATEMENT:
        getParallelStatement().clear();
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
      case JoliePackage.INSTALL_FUNCITON__NAME:
        return name != null && !name.isEmpty();
      case JoliePackage.INSTALL_FUNCITON__PROCESS:
        return process != null && !process.isEmpty();
      case JoliePackage.INSTALL_FUNCITON__PARALLEL_STATEMENT:
        return parallelStatement != null && !parallelStatement.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //InstallFuncitonImpl
