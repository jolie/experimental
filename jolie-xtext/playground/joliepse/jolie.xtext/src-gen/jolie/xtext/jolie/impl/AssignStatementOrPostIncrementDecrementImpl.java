/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.util.Collection;

import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.RightSide;
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
 * An implementation of the model object '<em><b>Assign Statement Or Post Increment Decrement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementImpl#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignStatementOrPostIncrementDecrementImpl extends AssignStatementOrPostIncrementDecrementOrInputOperationImpl implements AssignStatementOrPostIncrementDecrement
{
  /**
   * The cached value of the '{@link #getVariablePath() <em>Variable Path</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablePath()
   * @generated
   * @ordered
   */
  protected EList<VariablePath> variablePath;

  /**
   * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSide()
   * @generated
   * @ordered
   */
  protected RightSide rightSide;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignStatementOrPostIncrementDecrementImpl()
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
    return JoliePackage.Literals.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariablePath> getVariablePath()
  {
    if (variablePath == null)
    {
      variablePath = new EObjectContainmentEList<VariablePath>(VariablePath.class, this, JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH);
    }
    return variablePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSide getRightSide()
  {
    return rightSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightSide(RightSide newRightSide, NotificationChain msgs)
  {
    RightSide oldRightSide = rightSide;
    rightSide = newRightSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE, oldRightSide, newRightSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightSide(RightSide newRightSide)
  {
    if (newRightSide != rightSide)
    {
      NotificationChain msgs = null;
      if (rightSide != null)
        msgs = ((InternalEObject)rightSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE, null, msgs);
      if (newRightSide != null)
        msgs = ((InternalEObject)newRightSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE, null, msgs);
      msgs = basicSetRightSide(newRightSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE, newRightSide, newRightSide));
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
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH:
        return ((InternalEList<?>)getVariablePath()).basicRemove(otherEnd, msgs);
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE:
        return basicSetRightSide(null, msgs);
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
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH:
        return getVariablePath();
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE:
        return getRightSide();
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
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH:
        getVariablePath().clear();
        getVariablePath().addAll((Collection<? extends VariablePath>)newValue);
        return;
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE:
        setRightSide((RightSide)newValue);
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
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH:
        getVariablePath().clear();
        return;
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE:
        setRightSide((RightSide)null);
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
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH:
        return variablePath != null && !variablePath.isEmpty();
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE:
        return rightSide != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignStatementOrPostIncrementDecrementImpl
