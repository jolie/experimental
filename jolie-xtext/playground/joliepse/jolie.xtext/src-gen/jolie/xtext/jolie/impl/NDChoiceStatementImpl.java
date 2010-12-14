/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.util.Collection;

import jolie.xtext.jolie.InputOperation;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.NDChoiceStatement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ND Choice Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getNDChoiceStatement <em>ND Choice Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getInputOperation <em>Input Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getMainProcess <em>Main Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NDChoiceStatementImpl extends BasicStatementImpl implements NDChoiceStatement
{
  /**
   * The cached value of the '{@link #getNDChoiceStatement() <em>ND Choice Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNDChoiceStatement()
   * @generated
   * @ordered
   */
  protected EList<NDChoiceStatement> ndChoiceStatement;

  /**
   * The cached value of the '{@link #getInputOperation() <em>Input Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputOperation()
   * @generated
   * @ordered
   */
  protected EList<InputOperation> inputOperation;

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
  public EList<NDChoiceStatement> getNDChoiceStatement()
  {
    if (ndChoiceStatement == null)
    {
      ndChoiceStatement = new EObjectContainmentEList<NDChoiceStatement>(NDChoiceStatement.class, this, JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT);
    }
    return ndChoiceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputOperation> getInputOperation()
  {
    if (inputOperation == null)
    {
      inputOperation = new EObjectContainmentEList<InputOperation>(InputOperation.class, this, JoliePackage.ND_CHOICE_STATEMENT__INPUT_OPERATION);
    }
    return inputOperation;
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        return ((InternalEList<?>)getNDChoiceStatement()).basicRemove(otherEnd, msgs);
      case JoliePackage.ND_CHOICE_STATEMENT__INPUT_OPERATION:
        return ((InternalEList<?>)getInputOperation()).basicRemove(otherEnd, msgs);
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        return getNDChoiceStatement();
      case JoliePackage.ND_CHOICE_STATEMENT__INPUT_OPERATION:
        return getInputOperation();
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        getNDChoiceStatement().clear();
        getNDChoiceStatement().addAll((Collection<? extends NDChoiceStatement>)newValue);
        return;
      case JoliePackage.ND_CHOICE_STATEMENT__INPUT_OPERATION:
        getInputOperation().clear();
        getInputOperation().addAll((Collection<? extends InputOperation>)newValue);
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        getNDChoiceStatement().clear();
        return;
      case JoliePackage.ND_CHOICE_STATEMENT__INPUT_OPERATION:
        getInputOperation().clear();
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        return ndChoiceStatement != null && !ndChoiceStatement.isEmpty();
      case JoliePackage.ND_CHOICE_STATEMENT__INPUT_OPERATION:
        return inputOperation != null && !inputOperation.isEmpty();
      case JoliePackage.ND_CHOICE_STATEMENT__MAIN_PROCESS:
        return mainProcess != null && !mainProcess.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NDChoiceStatementImpl
