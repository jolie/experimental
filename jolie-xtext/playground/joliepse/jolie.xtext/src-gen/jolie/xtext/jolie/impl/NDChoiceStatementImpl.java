/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.util.Collection;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.NDChoiceStatement;
import jolie.xtext.jolie.Operation;
import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ND Choice Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getMainProcess <em>Main Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NDChoiceStatementImpl extends MinimalEObjectImpl.Container implements NDChoiceStatement
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
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EList<Operation> operation;

  /**
   * The cached value of the '{@link #getMainProcess() <em>Main Process</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainProcess()
   * @generated
   * @ordered
   */
  protected EList<MainProcess> mainProcess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NDChoiceStatementImpl()
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
    return JoliePackage.Literals.ND_CHOICE_STATEMENT;
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
      variablePath = new EObjectContainmentEList<VariablePath>(VariablePath.class, this, JoliePackage.ND_CHOICE_STATEMENT__VARIABLE_PATH);
    }
    return variablePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperation()
  {
    if (operation == null)
    {
      operation = new EObjectContainmentEList<Operation>(Operation.class, this, JoliePackage.ND_CHOICE_STATEMENT__OPERATION);
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MainProcess> getMainProcess()
  {
    if (mainProcess == null)
    {
      mainProcess = new EObjectContainmentEList<MainProcess>(MainProcess.class, this, JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS);
    }
    return mainProcess;
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
      case JoliePackage.ND_CHOICE_STATEMENT__VARIABLE_PATH:
        return ((InternalEList<?>)getVariablePath()).basicRemove(otherEnd, msgs);
      case JoliePackage.ND_CHOICE_STATEMENT__OPERATION:
        return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
      case JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS:
        return ((InternalEList<?>)getMainProcess()).basicRemove(otherEnd, msgs);
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
      case JoliePackage.ND_CHOICE_STATEMENT__VARIABLE_PATH:
        return getVariablePath();
      case JoliePackage.ND_CHOICE_STATEMENT__OPERATION:
        return getOperation();
      case JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS:
        return getMainProcess();
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
      case JoliePackage.ND_CHOICE_STATEMENT__VARIABLE_PATH:
        getVariablePath().clear();
        getVariablePath().addAll((Collection<? extends VariablePath>)newValue);
        return;
      case JoliePackage.ND_CHOICE_STATEMENT__OPERATION:
        getOperation().clear();
        getOperation().addAll((Collection<? extends Operation>)newValue);
        return;
      case JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS:
        getMainProcess().clear();
        getMainProcess().addAll((Collection<? extends MainProcess>)newValue);
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
      case JoliePackage.ND_CHOICE_STATEMENT__VARIABLE_PATH:
        getVariablePath().clear();
        return;
      case JoliePackage.ND_CHOICE_STATEMENT__OPERATION:
        getOperation().clear();
        return;
      case JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS:
        getMainProcess().clear();
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
      case JoliePackage.ND_CHOICE_STATEMENT__VARIABLE_PATH:
        return variablePath != null && !variablePath.isEmpty();
      case JoliePackage.ND_CHOICE_STATEMENT__OPERATION:
        return operation != null && !operation.isEmpty();
      case JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS:
        return mainProcess != null && !mainProcess.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NDChoiceStatementImpl
