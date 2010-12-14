/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.util.Collection;

import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.VariablePath;

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
 * An implementation of the model object '<em><b>Variable Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.VariablePathImpl#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.VariablePathImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariablePathImpl extends InputOperationImpl implements VariablePath
{
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
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<Expression> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariablePathImpl()
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
    return JoliePackage.Literals.VARIABLE_PATH;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.VARIABLE_PATH__VARIABLE_PATH, oldVariablePath, newVariablePath);
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
        msgs = ((InternalEObject)variablePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.VARIABLE_PATH__VARIABLE_PATH, null, msgs);
      if (newVariablePath != null)
        msgs = ((InternalEObject)newVariablePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.VARIABLE_PATH__VARIABLE_PATH, null, msgs);
      msgs = basicSetVariablePath(newVariablePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.VARIABLE_PATH__VARIABLE_PATH, newVariablePath, newVariablePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<Expression>(Expression.class, this, JoliePackage.VARIABLE_PATH__CHILDREN);
    }
    return children;
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
      case JoliePackage.VARIABLE_PATH__VARIABLE_PATH:
        return basicSetVariablePath(null, msgs);
      case JoliePackage.VARIABLE_PATH__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case JoliePackage.VARIABLE_PATH__VARIABLE_PATH:
        return getVariablePath();
      case JoliePackage.VARIABLE_PATH__CHILDREN:
        return getChildren();
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
      case JoliePackage.VARIABLE_PATH__VARIABLE_PATH:
        setVariablePath((VariablePath)newValue);
        return;
      case JoliePackage.VARIABLE_PATH__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends Expression>)newValue);
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
      case JoliePackage.VARIABLE_PATH__VARIABLE_PATH:
        setVariablePath((VariablePath)null);
        return;
      case JoliePackage.VARIABLE_PATH__CHILDREN:
        getChildren().clear();
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
      case JoliePackage.VARIABLE_PATH__VARIABLE_PATH:
        return variablePath != null;
      case JoliePackage.VARIABLE_PATH__CHILDREN:
        return children != null && !children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariablePathImpl
