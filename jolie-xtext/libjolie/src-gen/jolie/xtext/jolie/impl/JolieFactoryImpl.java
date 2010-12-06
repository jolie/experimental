/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.AssignStatement;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.IntLiteral;
import jolie.xtext.jolie.JolieFactory;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.OLSyntaxNode;
import jolie.xtext.jolie.Operation;
import jolie.xtext.jolie.ParallelStatement;
import jolie.xtext.jolie.PostDecrementStatement;
import jolie.xtext.jolie.PostIncrementStatement;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.RealLiteral;
import jolie.xtext.jolie.SequenceStatement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JolieFactoryImpl extends EFactoryImpl implements JolieFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JolieFactory init()
  {
    try
    {
      JolieFactory theJolieFactory = (JolieFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/Jolie"); 
      if (theJolieFactory != null)
      {
        return theJolieFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JolieFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JolieFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JoliePackage.PROGRAM: return createProgram();
      case JoliePackage.MAIN: return createMain();
      case JoliePackage.MAIN_PROCESS: return createMainProcess();
      case JoliePackage.PROCESS: return createProcess();
      case JoliePackage.PARALLEL_STATEMENT: return createParallelStatement();
      case JoliePackage.SEQUENCE_STATEMENT: return createSequenceStatement();
      case JoliePackage.BASIC_STATEMENT: return createBasicStatement();
      case JoliePackage.ASSIGN_STATEMENT: return createAssignStatement();
      case JoliePackage.POST_INCREMENT_STATEMENT: return createPostIncrementStatement();
      case JoliePackage.POST_DECREMENT_STATEMENT: return createPostDecrementStatement();
      case JoliePackage.EXPRESSION: return createExpression();
      case JoliePackage.OL_SYNTAX_NODE: return createOLSyntaxNode();
      case JoliePackage.OPERATION: return createOperation();
      case JoliePackage.INT_LITERAL: return createIntLiteral();
      case JoliePackage.REAL_LITERAL: return createRealLiteral();
      case JoliePackage.STRING: return createString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainProcess createMainProcess()
  {
    MainProcessImpl mainProcess = new MainProcessImpl();
    return mainProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jolie.xtext.jolie.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParallelStatement createParallelStatement()
  {
    ParallelStatementImpl parallelStatement = new ParallelStatementImpl();
    return parallelStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceStatement createSequenceStatement()
  {
    SequenceStatementImpl sequenceStatement = new SequenceStatementImpl();
    return sequenceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicStatement createBasicStatement()
  {
    BasicStatementImpl basicStatement = new BasicStatementImpl();
    return basicStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignStatement createAssignStatement()
  {
    AssignStatementImpl assignStatement = new AssignStatementImpl();
    return assignStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostIncrementStatement createPostIncrementStatement()
  {
    PostIncrementStatementImpl postIncrementStatement = new PostIncrementStatementImpl();
    return postIncrementStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostDecrementStatement createPostDecrementStatement()
  {
    PostDecrementStatementImpl postDecrementStatement = new PostDecrementStatementImpl();
    return postDecrementStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OLSyntaxNode createOLSyntaxNode()
  {
    OLSyntaxNodeImpl olSyntaxNode = new OLSyntaxNodeImpl();
    return olSyntaxNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jolie.xtext.jolie.String createString()
  {
    StringImpl string = new StringImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoliePackage getJoliePackage()
  {
    return (JoliePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JoliePackage getPackage()
  {
    return JoliePackage.eINSTANCE;
  }

} //JolieFactoryImpl
