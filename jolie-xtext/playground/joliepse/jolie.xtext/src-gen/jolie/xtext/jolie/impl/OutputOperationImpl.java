/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.InstallFunciton;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.OutputOperation;
import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.OutputOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputOperationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputOperationImpl#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputOperationImpl#getInstallFunction <em>Install Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputOperationImpl extends MinimalEObjectImpl.Container implements OutputOperation
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
   * The cached value of the '{@link #getInstallFunction() <em>Install Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallFunction()
   * @generated
   * @ordered
   */
  protected InstallFunciton installFunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputOperationImpl()
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
    return JoliePackage.Literals.OUTPUT_OPERATION;
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
      name = new EDataTypeEList<String>(String.class, this, JoliePackage.OUTPUT_OPERATION__NAME);
    }
    return name;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_OPERATION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OUTPUT_OPERATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OUTPUT_OPERATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_OPERATION__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH, oldVariablePath, newVariablePath);
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
        msgs = ((InternalEObject)variablePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH, null, msgs);
      if (newVariablePath != null)
        msgs = ((InternalEObject)newVariablePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH, null, msgs);
      msgs = basicSetVariablePath(newVariablePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH, newVariablePath, newVariablePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstallFunciton getInstallFunction()
  {
    return installFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstallFunction(InstallFunciton newInstallFunction, NotificationChain msgs)
  {
    InstallFunciton oldInstallFunction = installFunction;
    installFunction = newInstallFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION, oldInstallFunction, newInstallFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstallFunction(InstallFunciton newInstallFunction)
  {
    if (newInstallFunction != installFunction)
    {
      NotificationChain msgs = null;
      if (installFunction != null)
        msgs = ((InternalEObject)installFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION, null, msgs);
      if (newInstallFunction != null)
        msgs = ((InternalEObject)newInstallFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION, null, msgs);
      msgs = basicSetInstallFunction(newInstallFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION, newInstallFunction, newInstallFunction));
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
      case JoliePackage.OUTPUT_OPERATION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH:
        return basicSetVariablePath(null, msgs);
      case JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION:
        return basicSetInstallFunction(null, msgs);
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
      case JoliePackage.OUTPUT_OPERATION__NAME:
        return getName();
      case JoliePackage.OUTPUT_OPERATION__EXPRESSION:
        return getExpression();
      case JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH:
        return getVariablePath();
      case JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION:
        return getInstallFunction();
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
      case JoliePackage.OUTPUT_OPERATION__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.OUTPUT_OPERATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH:
        setVariablePath((VariablePath)newValue);
        return;
      case JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION:
        setInstallFunction((InstallFunciton)newValue);
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
      case JoliePackage.OUTPUT_OPERATION__NAME:
        getName().clear();
        return;
      case JoliePackage.OUTPUT_OPERATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH:
        setVariablePath((VariablePath)null);
        return;
      case JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION:
        setInstallFunction((InstallFunciton)null);
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
      case JoliePackage.OUTPUT_OPERATION__NAME:
        return name != null && !name.isEmpty();
      case JoliePackage.OUTPUT_OPERATION__EXPRESSION:
        return expression != null;
      case JoliePackage.OUTPUT_OPERATION__VARIABLE_PATH:
        return variablePath != null;
      case JoliePackage.OUTPUT_OPERATION__INSTALL_FUNCTION:
        return installFunction != null;
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

} //OutputOperationImpl
