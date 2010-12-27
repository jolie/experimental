/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.InputOperation;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.MainProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.InputOperationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.InputOperationImpl#getMainProcess <em>Main Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOperationImpl extends MinimalEObjectImpl.Container implements InputOperation
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

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
  protected InputOperationImpl()
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
    return JoliePackage.Literals.INPUT_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.INPUT_OPERATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INPUT_OPERATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INPUT_OPERATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.INPUT_OPERATION__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.INPUT_OPERATION__MAIN_PROCESS, oldMainProcess, newMainProcess);
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
        msgs = ((InternalEObject)mainProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INPUT_OPERATION__MAIN_PROCESS, null, msgs);
      if (newMainProcess != null)
        msgs = ((InternalEObject)newMainProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INPUT_OPERATION__MAIN_PROCESS, null, msgs);
      msgs = basicSetMainProcess(newMainProcess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.INPUT_OPERATION__MAIN_PROCESS, newMainProcess, newMainProcess));
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
      case JoliePackage.INPUT_OPERATION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JoliePackage.INPUT_OPERATION__MAIN_PROCESS:
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
      case JoliePackage.INPUT_OPERATION__EXPRESSION:
        return getExpression();
      case JoliePackage.INPUT_OPERATION__MAIN_PROCESS:
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
      case JoliePackage.INPUT_OPERATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JoliePackage.INPUT_OPERATION__MAIN_PROCESS:
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
      case JoliePackage.INPUT_OPERATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JoliePackage.INPUT_OPERATION__MAIN_PROCESS:
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
      case JoliePackage.INPUT_OPERATION__EXPRESSION:
        return expression != null;
      case JoliePackage.INPUT_OPERATION__MAIN_PROCESS:
        return mainProcess != null;
    }
    return super.eIsSet(featureID);
  }

} //InputOperationImpl
