/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.InputOperation;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.OutputOperation;
import jolie.xtext.jolie.RightSide;
import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.RightSideImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.RightSideImpl#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.RightSideImpl#getInputOperation <em>Input Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.RightSideImpl#getOutputOperation <em>Output Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightSideImpl extends MinimalEObjectImpl.Container implements RightSide
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
   * The cached value of the '{@link #getVariablePath() <em>Variable Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablePath()
   * @generated
   * @ordered
   */
  protected VariablePath variablePath;

  /**
   * The cached value of the '{@link #getInputOperation() <em>Input Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputOperation()
   * @generated
   * @ordered
   */
  protected InputOperation inputOperation;

  /**
   * The cached value of the '{@link #getOutputOperation() <em>Output Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputOperation()
   * @generated
   * @ordered
   */
  protected OutputOperation outputOperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightSideImpl()
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
    return JoliePackage.Literals.RIGHT_SIDE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablePath getVariablePath()
  {
    return variablePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariablePath(VariablePath newVariablePath, NotificationChain msgs)
  {
    VariablePath oldVariablePath = variablePath;
    variablePath = newVariablePath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__VARIABLE_PATH, oldVariablePath, newVariablePath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariablePath(VariablePath newVariablePath)
  {
    if (newVariablePath != variablePath)
    {
      NotificationChain msgs = null;
      if (variablePath != null)
        msgs = ((InternalEObject)variablePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__VARIABLE_PATH, null, msgs);
      if (newVariablePath != null)
        msgs = ((InternalEObject)newVariablePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__VARIABLE_PATH, null, msgs);
      msgs = basicSetVariablePath(newVariablePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__VARIABLE_PATH, newVariablePath, newVariablePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOperation getInputOperation()
  {
    return inputOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputOperation(InputOperation newInputOperation, NotificationChain msgs)
  {
    InputOperation oldInputOperation = inputOperation;
    inputOperation = newInputOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__INPUT_OPERATION, oldInputOperation, newInputOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputOperation(InputOperation newInputOperation)
  {
    if (newInputOperation != inputOperation)
    {
      NotificationChain msgs = null;
      if (inputOperation != null)
        msgs = ((InternalEObject)inputOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__INPUT_OPERATION, null, msgs);
      if (newInputOperation != null)
        msgs = ((InternalEObject)newInputOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__INPUT_OPERATION, null, msgs);
      msgs = basicSetInputOperation(newInputOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__INPUT_OPERATION, newInputOperation, newInputOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOperation getOutputOperation()
  {
    return outputOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputOperation(OutputOperation newOutputOperation, NotificationChain msgs)
  {
    OutputOperation oldOutputOperation = outputOperation;
    outputOperation = newOutputOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION, oldOutputOperation, newOutputOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputOperation(OutputOperation newOutputOperation)
  {
    if (newOutputOperation != outputOperation)
    {
      NotificationChain msgs = null;
      if (outputOperation != null)
        msgs = ((InternalEObject)outputOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION, null, msgs);
      if (newOutputOperation != null)
        msgs = ((InternalEObject)newOutputOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION, null, msgs);
      msgs = basicSetOutputOperation(newOutputOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION, newOutputOperation, newOutputOperation));
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
      case JoliePackage.RIGHT_SIDE__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JoliePackage.RIGHT_SIDE__VARIABLE_PATH:
        return basicSetVariablePath(null, msgs);
      case JoliePackage.RIGHT_SIDE__INPUT_OPERATION:
        return basicSetInputOperation(null, msgs);
      case JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION:
        return basicSetOutputOperation(null, msgs);
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
      case JoliePackage.RIGHT_SIDE__EXPRESSION:
        return getExpression();
      case JoliePackage.RIGHT_SIDE__VARIABLE_PATH:
        return getVariablePath();
      case JoliePackage.RIGHT_SIDE__INPUT_OPERATION:
        return getInputOperation();
      case JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION:
        return getOutputOperation();
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
      case JoliePackage.RIGHT_SIDE__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JoliePackage.RIGHT_SIDE__VARIABLE_PATH:
        setVariablePath((VariablePath)newValue);
        return;
      case JoliePackage.RIGHT_SIDE__INPUT_OPERATION:
        setInputOperation((InputOperation)newValue);
        return;
      case JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION:
        setOutputOperation((OutputOperation)newValue);
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
      case JoliePackage.RIGHT_SIDE__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JoliePackage.RIGHT_SIDE__VARIABLE_PATH:
        setVariablePath((VariablePath)null);
        return;
      case JoliePackage.RIGHT_SIDE__INPUT_OPERATION:
        setInputOperation((InputOperation)null);
        return;
      case JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION:
        setOutputOperation((OutputOperation)null);
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
      case JoliePackage.RIGHT_SIDE__EXPRESSION:
        return expression != null;
      case JoliePackage.RIGHT_SIDE__VARIABLE_PATH:
        return variablePath != null;
      case JoliePackage.RIGHT_SIDE__INPUT_OPERATION:
        return inputOperation != null;
      case JoliePackage.RIGHT_SIDE__OUTPUT_OPERATION:
        return outputOperation != null;
    }
    return super.eIsSet(featureID);
  }

} //RightSideImpl
