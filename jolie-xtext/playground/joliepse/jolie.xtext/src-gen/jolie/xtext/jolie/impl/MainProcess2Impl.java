/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.MainProcess2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Process2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.MainProcess2Impl#getMainProcess <em>Main Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainProcess2Impl extends NDChoiceStatementImpl implements MainProcess2
{
  /**
   * The cached value of the '{@link #getMainProcess() <em>Main Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainProcess()
   * @generated
   * @ordered
   */
  protected MainProcess mainProcess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainProcess2Impl()
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
    return JoliePackage.Literals.MAIN_PROCESS2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainProcess getMainProcess()
  {
    return mainProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainProcess(MainProcess newMainProcess, NotificationChain msgs)
  {
    MainProcess oldMainProcess = mainProcess;
    mainProcess = newMainProcess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.MAIN_PROCESS2__MAIN_PROCESS, oldMainProcess, newMainProcess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainProcess(MainProcess newMainProcess)
  {
    if (newMainProcess != mainProcess)
    {
      NotificationChain msgs = null;
      if (mainProcess != null)
        msgs = ((InternalEObject)mainProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.MAIN_PROCESS2__MAIN_PROCESS, null, msgs);
      if (newMainProcess != null)
        msgs = ((InternalEObject)newMainProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.MAIN_PROCESS2__MAIN_PROCESS, null, msgs);
      msgs = basicSetMainProcess(newMainProcess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.MAIN_PROCESS2__MAIN_PROCESS, newMainProcess, newMainProcess));
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
      case JoliePackage.MAIN_PROCESS2__MAIN_PROCESS:
        return basicSetMainProcess(null, msgs);
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
      case JoliePackage.MAIN_PROCESS2__MAIN_PROCESS:
        return getMainProcess();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoliePackage.MAIN_PROCESS2__MAIN_PROCESS:
        setMainProcess((MainProcess)newValue);
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
      case JoliePackage.MAIN_PROCESS2__MAIN_PROCESS:
        setMainProcess((MainProcess)null);
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
      case JoliePackage.MAIN_PROCESS2__MAIN_PROCESS:
        return mainProcess != null;
    }
    return super.eIsSet(featureID);
  }

} //MainProcess2Impl
