/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.AssignStatement;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.RightSideAssignament;
import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.AssignStatementImpl#getAssignStatement <em>Assign Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.AssignStatementImpl#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.AssignStatementImpl#getRightSideAssign <em>Right Side Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignStatementImpl extends BasicStatementImpl implements AssignStatement
{
  /**
   * The cached value of the '{@link #getAssignStatement() <em>Assign Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignStatement()
   * @generated
   * @ordered
   */
  protected AssignStatement assignStatement;

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
   * The cached value of the '{@link #getRightSideAssign() <em>Right Side Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSideAssign()
   * @generated
   * @ordered
   */
  protected RightSideAssignament rightSideAssign;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignStatementImpl()
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
    return JoliePackage.Literals.ASSIGN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignStatement getAssignStatement()
  {
    return assignStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignStatement(AssignStatement newAssignStatement, NotificationChain msgs)
  {
    AssignStatement oldAssignStatement = assignStatement;
    assignStatement = newAssignStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT, oldAssignStatement, newAssignStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignStatement(AssignStatement newAssignStatement)
  {
    if (newAssignStatement != assignStatement)
    {
      NotificationChain msgs = null;
      if (assignStatement != null)
        msgs = ((InternalEObject)assignStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT, null, msgs);
      if (newAssignStatement != null)
        msgs = ((InternalEObject)newAssignStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT, null, msgs);
      msgs = basicSetAssignStatement(newAssignStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT, newAssignStatement, newAssignStatement));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH, oldVariablePath, newVariablePath);
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
        msgs = ((InternalEObject)variablePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH, null, msgs);
      if (newVariablePath != null)
        msgs = ((InternalEObject)newVariablePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH, null, msgs);
      msgs = basicSetVariablePath(newVariablePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH, newVariablePath, newVariablePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSideAssignament getRightSideAssign()
  {
    return rightSideAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightSideAssign(RightSideAssignament newRightSideAssign, NotificationChain msgs)
  {
    RightSideAssignament oldRightSideAssign = rightSideAssign;
    rightSideAssign = newRightSideAssign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN, oldRightSideAssign, newRightSideAssign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightSideAssign(RightSideAssignament newRightSideAssign)
  {
    if (newRightSideAssign != rightSideAssign)
    {
      NotificationChain msgs = null;
      if (rightSideAssign != null)
        msgs = ((InternalEObject)rightSideAssign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN, null, msgs);
      if (newRightSideAssign != null)
        msgs = ((InternalEObject)newRightSideAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN, null, msgs);
      msgs = basicSetRightSideAssign(newRightSideAssign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN, newRightSideAssign, newRightSideAssign));
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
      case JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT:
        return basicSetAssignStatement(null, msgs);
      case JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH:
        return basicSetVariablePath(null, msgs);
      case JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN:
        return basicSetRightSideAssign(null, msgs);
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
      case JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT:
        return getAssignStatement();
      case JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH:
        return getVariablePath();
      case JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN:
        return getRightSideAssign();
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
      case JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT:
        setAssignStatement((AssignStatement)newValue);
        return;
      case JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH:
        setVariablePath((VariablePath)newValue);
        return;
      case JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN:
        setRightSideAssign((RightSideAssignament)newValue);
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
      case JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT:
        setAssignStatement((AssignStatement)null);
        return;
      case JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH:
        setVariablePath((VariablePath)null);
        return;
      case JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN:
        setRightSideAssign((RightSideAssignament)null);
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
      case JoliePackage.ASSIGN_STATEMENT__ASSIGN_STATEMENT:
        return assignStatement != null;
      case JoliePackage.ASSIGN_STATEMENT__VARIABLE_PATH:
        return variablePath != null;
      case JoliePackage.ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN:
        return rightSideAssign != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignStatementImpl
