/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.util.Collection;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.ParallelStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.ProcessImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProcessImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends BasicStatementImpl implements jolie.xtext.jolie.Process
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<ParallelStatement> children;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected jolie.xtext.jolie.Process process;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessImpl()
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
    return JoliePackage.Literals.PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParallelStatement> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<ParallelStatement>(ParallelStatement.class, this, JoliePackage.PROCESS__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jolie.xtext.jolie.Process getProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcess(jolie.xtext.jolie.Process newProcess, NotificationChain msgs)
  {
    jolie.xtext.jolie.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.PROCESS__PROCESS, oldProcess, newProcess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess(jolie.xtext.jolie.Process newProcess)
  {
    if (newProcess != process)
    {
      NotificationChain msgs = null;
      if (process != null)
        msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.PROCESS__PROCESS, null, msgs);
      if (newProcess != null)
        msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.PROCESS__PROCESS, null, msgs);
      msgs = basicSetProcess(newProcess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.PROCESS__PROCESS, newProcess, newProcess));
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
      case JoliePackage.PROCESS__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROCESS__PROCESS:
        return basicSetProcess(null, msgs);
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
      case JoliePackage.PROCESS__CHILDREN:
        return getChildren();
      case JoliePackage.PROCESS__PROCESS:
        return getProcess();
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
      case JoliePackage.PROCESS__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends ParallelStatement>)newValue);
        return;
      case JoliePackage.PROCESS__PROCESS:
        setProcess((jolie.xtext.jolie.Process)newValue);
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
      case JoliePackage.PROCESS__CHILDREN:
        getChildren().clear();
        return;
      case JoliePackage.PROCESS__PROCESS:
        setProcess((jolie.xtext.jolie.Process)null);
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
      case JoliePackage.PROCESS__CHILDREN:
        return children != null && !children.isEmpty();
      case JoliePackage.PROCESS__PROCESS:
        return process != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessImpl
