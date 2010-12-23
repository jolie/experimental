/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.util;

import java.util.List;

import jolie.xtext.jolie.Aggregates;
import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement;
import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.InputPortStatement;
import jolie.xtext.jolie.IntLiteral;
import jolie.xtext.jolie.Interfaces;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Location;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.NDChoiceStatement;
import jolie.xtext.jolie.OLSyntaxNode;
import jolie.xtext.jolie.OneWayOperation;
import jolie.xtext.jolie.Operation;
import jolie.xtext.jolie.OutputPortStatement;
import jolie.xtext.jolie.ParallelStatement;
import jolie.xtext.jolie.Port;
import jolie.xtext.jolie.PreIncrementDecrement;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.Protocol;
import jolie.xtext.jolie.RealLiteral;
import jolie.xtext.jolie.Redirects;
import jolie.xtext.jolie.RequestResponseOperation;
import jolie.xtext.jolie.RightSide;
import jolie.xtext.jolie.SequenceStatement;
import jolie.xtext.jolie.TYPEDEF;
import jolie.xtext.jolie.Type;
import jolie.xtext.jolie.TypeDefinition;
import jolie.xtext.jolie.Uri;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jolie.xtext.jolie.JoliePackage
 * @generated
 */
public class JolieSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JoliePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JolieSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JoliePackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JoliePackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.TYPEDEF:
      {
        TYPEDEF typedef = (TYPEDEF)theEObject;
        T result = caseTYPEDEF(typedef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.MAIN:
      {
        Main main = (Main)theEObject;
        T result = caseMain(main);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.MAIN_PROCESS:
      {
        MainProcess mainProcess = (MainProcess)theEObject;
        T result = caseMainProcess(mainProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.PROCESS:
      {
        jolie.xtext.jolie.Process process = (jolie.xtext.jolie.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.PARALLEL_STATEMENT:
      {
        ParallelStatement parallelStatement = (ParallelStatement)theEObject;
        T result = caseParallelStatement(parallelStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.SEQUENCE_STATEMENT:
      {
        SequenceStatement sequenceStatement = (SequenceStatement)theEObject;
        T result = caseSequenceStatement(sequenceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.BASIC_STATEMENT:
      {
        BasicStatement basicStatement = (BasicStatement)theEObject;
        T result = caseBasicStatement(basicStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION:
      {
        AssignStatementOrPostIncrementDecrementOrInputOperation assignStatementOrPostIncrementDecrementOrInputOperation = (AssignStatementOrPostIncrementDecrementOrInputOperation)theEObject;
        T result = caseAssignStatementOrPostIncrementDecrementOrInputOperation(assignStatementOrPostIncrementDecrementOrInputOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.RIGHT_SIDE:
      {
        RightSide rightSide = (RightSide)theEObject;
        T result = caseRightSide(rightSide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseExpression(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.PRE_INCREMENT_DECREMENT:
      {
        PreIncrementDecrement preIncrementDecrement = (PreIncrementDecrement)theEObject;
        T result = casePreIncrementDecrement(preIncrementDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.VARIABLE_PATH:
      {
        VariablePath variablePath = (VariablePath)theEObject;
        T result = caseVariablePath(variablePath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.WITH:
      {
        With with = (With)theEObject;
        T result = caseWith(with);
        if (result == null) result = caseBasicStatement(with);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.ND_CHOICE_STATEMENT:
      {
        NDChoiceStatement ndChoiceStatement = (NDChoiceStatement)theEObject;
        T result = caseNDChoiceStatement(ndChoiceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.INPUT_PORT_STATEMENT:
      {
        InputPortStatement inputPortStatement = (InputPortStatement)theEObject;
        T result = caseInputPortStatement(inputPortStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.OUTPUT_PORT_STATEMENT:
      {
        OutputPortStatement outputPortStatement = (OutputPortStatement)theEObject;
        T result = caseOutputPortStatement(outputPortStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.ONE_WAY_OPERATION:
      {
        OneWayOperation oneWayOperation = (OneWayOperation)theEObject;
        T result = caseOneWayOperation(oneWayOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.REQUEST_RESPONSE_OPERATION:
      {
        RequestResponseOperation requestResponseOperation = (RequestResponseOperation)theEObject;
        T result = caseRequestResponseOperation(requestResponseOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.LOCATION:
      {
        Location location = (Location)theEObject;
        T result = caseLocation(location);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.URI:
      {
        Uri uri = (Uri)theEObject;
        T result = caseUri(uri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.INTERFACES:
      {
        Interfaces interfaces = (Interfaces)theEObject;
        T result = caseInterfaces(interfaces);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.PROTOCOL:
      {
        Protocol protocol = (Protocol)theEObject;
        T result = caseProtocol(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.REDIRECTS:
      {
        Redirects redirects = (Redirects)theEObject;
        T result = caseRedirects(redirects);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.AGGREGATES:
      {
        Aggregates aggregates = (Aggregates)theEObject;
        T result = caseAggregates(aggregates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.OL_SYNTAX_NODE:
      {
        OLSyntaxNode olSyntaxNode = (OLSyntaxNode)theEObject;
        T result = caseOLSyntaxNode(olSyntaxNode);
        if (result == null) result = caseMainProcess(olSyntaxNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT:
      {
        AssignStatementOrPostIncrementDecrement assignStatementOrPostIncrementDecrement = (AssignStatementOrPostIncrementDecrement)theEObject;
        T result = caseAssignStatementOrPostIncrementDecrement(assignStatementOrPostIncrementDecrement);
        if (result == null) result = caseAssignStatementOrPostIncrementDecrementOrInputOperation(assignStatementOrPostIncrementDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseExpression(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.REAL_LITERAL:
      {
        RealLiteral realLiteral = (RealLiteral)theEObject;
        T result = caseRealLiteral(realLiteral);
        if (result == null) result = caseExpression(realLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoliePackage.STRING:
      {
        jolie.xtext.jolie.String string = (jolie.xtext.jolie.String)theEObject;
        T result = caseString(string);
        if (result == null) result = caseExpression(string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TYPEDEF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TYPEDEF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTYPEDEF(TYPEDEF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMain(Main object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainProcess(MainProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(jolie.xtext.jolie.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallelStatement(ParallelStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceStatement(SequenceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicStatement(BasicStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign Statement Or Post Increment Decrement Or Input Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign Statement Or Post Increment Decrement Or Input Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignStatementOrPostIncrementDecrementOrInputOperation(AssignStatementOrPostIncrementDecrementOrInputOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Side</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Side</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightSide(RightSide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Increment Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Increment Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreIncrementDecrement(PreIncrementDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariablePath(VariablePath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>With</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>With</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWith(With object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ND Choice Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ND Choice Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNDChoiceStatement(NDChoiceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Port Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Port Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputPortStatement(InputPortStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Port Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Port Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputPortStatement(OutputPortStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Way Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Way Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneWayOperation(OneWayOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request Response Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request Response Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequestResponseOperation(RequestResponseOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocation(Location object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uri</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uri</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUri(Uri object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfaces</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfaces</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaces(Interfaces object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocol(Protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Redirects</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Redirects</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRedirects(Redirects object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregates(Aggregates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OL Syntax Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OL Syntax Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOLSyntaxNode(OLSyntaxNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign Statement Or Post Increment Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign Statement Or Post Increment Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignStatementOrPostIncrementDecrement(AssignStatementOrPostIncrementDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealLiteral(RealLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseString(jolie.xtext.jolie.String object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JolieSwitch
