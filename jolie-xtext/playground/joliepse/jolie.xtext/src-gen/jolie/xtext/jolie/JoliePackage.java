/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jolie.xtext.jolie.JolieFactory
 * @model kind="package"
 * @generated
 */
public interface JoliePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jolie";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Jolie";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jolie";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JoliePackage eINSTANCE = jolie.xtext.jolie.impl.JoliePackageImpl.init();

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ProgramImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.MainImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMain()
   * @generated
   */
  int MAIN = 1;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__MAINROCESS = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.MainProcessImpl <em>Main Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.MainProcessImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMainProcess()
   * @generated
   */
  int MAIN_PROCESS = 2;

  /**
   * The number of structural features of the '<em>Main Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PROCESS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.BasicStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBasicStatement()
   * @generated
   */
  int BASIC_STATEMENT = 6;

  /**
   * The number of structural features of the '<em>Basic Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ProcessImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 3;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__CHILDREN = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ParallelStatementImpl <em>Parallel Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ParallelStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getParallelStatement()
   * @generated
   */
  int PARALLEL_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_STATEMENT__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Parallel Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.SequenceStatementImpl <em>Sequence Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.SequenceStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSequenceStatement()
   * @generated
   */
  int SEQUENCE_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_STATEMENT__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Sequence Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.AssignStatementImpl <em>Assign Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.AssignStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatement()
   * @generated
   */
  int ASSIGN_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Assign Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT__ASSIGN_STATEMENT = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT__VARIABLE_PATH = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Side Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assign Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RightSideAssignamentImpl <em>Right Side Assignament</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RightSideAssignamentImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRightSideAssignament()
   * @generated
   */
  int RIGHT_SIDE_ASSIGNAMENT = 8;

  /**
   * The number of structural features of the '<em>Right Side Assignament</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE_ASSIGNAMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ExpressionImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = RIGHT_SIDE_ASSIGNAMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PREFIX = RIGHT_SIDE_ASSIGNAMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VARIABLE_PATH = RIGHT_SIDE_ASSIGNAMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = RIGHT_SIDE_ASSIGNAMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InputOperationImpl <em>Input Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InputOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInputOperation()
   * @generated
   */
  int INPUT_OPERATION = 12;

  /**
   * The number of structural features of the '<em>Input Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.VariablePathImpl <em>Variable Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.VariablePathImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getVariablePath()
   * @generated
   */
  int VARIABLE_PATH = 10;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__CHILDREN = INPUT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__VARIABLE_PATH = INPUT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH_FEATURE_COUNT = INPUT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl <em>ND Choice Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.NDChoiceStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getNDChoiceStatement()
   * @generated
   */
  int ND_CHOICE_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__INPUT_OPERATION = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Main Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__MAIN_PROCESS = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ND Choice Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RequestResponseOperationImpl <em>Request Response Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RequestResponseOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRequestResponseOperation()
   * @generated
   */
  int REQUEST_RESPONSE_OPERATION = 13;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__EXPRESSION = INPUT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Main Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__MAIN_PROCESS = INPUT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Request Response Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION_FEATURE_COUNT = INPUT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OLSyntaxNodeImpl <em>OL Syntax Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OLSyntaxNodeImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOLSyntaxNode()
   * @generated
   */
  int OL_SYNTAX_NODE = 14;

  /**
   * The feature id for the '<em><b>Parallel Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OL_SYNTAX_NODE__PARALLEL_STATEMENT = MAIN_PROCESS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>OL Syntax Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OL_SYNTAX_NODE_FEATURE_COUNT = MAIN_PROCESS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 15;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PREFIX = EXPRESSION__PREFIX;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.IntLiteralImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__PREFIX = EXPRESSION__PREFIX;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RealLiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RealLiteralImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRealLiteral()
   * @generated
   */
  int REAL_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__PREFIX = EXPRESSION__PREFIX;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.StringImpl <em>String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.StringImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getString()
   * @generated
   */
  int STRING = 18;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__PREFIX = EXPRESSION__PREFIX;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see jolie.xtext.jolie.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Program#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see jolie.xtext.jolie.Program#getMain()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Main();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see jolie.xtext.jolie.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Main#getMainrocess <em>Mainrocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainrocess</em>'.
   * @see jolie.xtext.jolie.Main#getMainrocess()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Mainrocess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.MainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.MainProcess
   * @generated
   */
  EClass getMainProcess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see jolie.xtext.jolie.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Process#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.Process#getChildren()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Children();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Process#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Process</em>'.
   * @see jolie.xtext.jolie.Process#getProcess()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Process();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.ParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel Statement</em>'.
   * @see jolie.xtext.jolie.ParallelStatement
   * @generated
   */
  EClass getParallelStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.ParallelStatement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.ParallelStatement#getChildren()
   * @see #getParallelStatement()
   * @generated
   */
  EReference getParallelStatement_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.SequenceStatement <em>Sequence Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Statement</em>'.
   * @see jolie.xtext.jolie.SequenceStatement
   * @generated
   */
  EClass getSequenceStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.SequenceStatement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.SequenceStatement#getChildren()
   * @see #getSequenceStatement()
   * @generated
   */
  EReference getSequenceStatement_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.BasicStatement <em>Basic Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Statement</em>'.
   * @see jolie.xtext.jolie.BasicStatement
   * @generated
   */
  EClass getBasicStatement();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.AssignStatement <em>Assign Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Statement</em>'.
   * @see jolie.xtext.jolie.AssignStatement
   * @generated
   */
  EClass getAssignStatement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.AssignStatement#getAssignStatement <em>Assign Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign Statement</em>'.
   * @see jolie.xtext.jolie.AssignStatement#getAssignStatement()
   * @see #getAssignStatement()
   * @generated
   */
  EReference getAssignStatement_AssignStatement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.AssignStatement#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.AssignStatement#getVariablePath()
   * @see #getAssignStatement()
   * @generated
   */
  EReference getAssignStatement_VariablePath();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.AssignStatement#getRightSideAssign <em>Right Side Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Side Assign</em>'.
   * @see jolie.xtext.jolie.AssignStatement#getRightSideAssign()
   * @see #getAssignStatement()
   * @generated
   */
  EReference getAssignStatement_RightSideAssign();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RightSideAssignament <em>Right Side Assignament</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Side Assignament</em>'.
   * @see jolie.xtext.jolie.RightSideAssignament
   * @generated
   */
  EClass getRightSideAssignament();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see jolie.xtext.jolie.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.Expression#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see jolie.xtext.jolie.Expression#getPrefix()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Expression#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.Expression#getVariablePath()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_VariablePath();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.VariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.VariablePath
   * @generated
   */
  EClass getVariablePath();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.VariablePath#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.VariablePath#getChildren()
   * @see #getVariablePath()
   * @generated
   */
  EReference getVariablePath_Children();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.VariablePath#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.VariablePath#getVariablePath()
   * @see #getVariablePath()
   * @generated
   */
  EReference getVariablePath_VariablePath();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.NDChoiceStatement <em>ND Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ND Choice Statement</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement
   * @generated
   */
  EClass getNDChoiceStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getNDChoiceStatement <em>ND Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>ND Choice Statement</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getNDChoiceStatement()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_NDChoiceStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getInputOperation <em>Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Operation</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getInputOperation()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_InputOperation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getMainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getMainProcess()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_MainProcess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.InputOperation <em>Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Operation</em>'.
   * @see jolie.xtext.jolie.InputOperation
   * @generated
   */
  EClass getInputOperation();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request Response Operation</em>'.
   * @see jolie.xtext.jolie.RequestResponseOperation
   * @generated
   */
  EClass getRequestResponseOperation();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RequestResponseOperation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.RequestResponseOperation#getExpression()
   * @see #getRequestResponseOperation()
   * @generated
   */
  EReference getRequestResponseOperation_Expression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RequestResponseOperation#getMainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.RequestResponseOperation#getMainProcess()
   * @see #getRequestResponseOperation()
   * @generated
   */
  EReference getRequestResponseOperation_MainProcess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.OLSyntaxNode <em>OL Syntax Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OL Syntax Node</em>'.
   * @see jolie.xtext.jolie.OLSyntaxNode
   * @generated
   */
  EClass getOLSyntaxNode();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.OLSyntaxNode#getParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parallel Statement</em>'.
   * @see jolie.xtext.jolie.OLSyntaxNode#getParallelStatement()
   * @see #getOLSyntaxNode()
   * @generated
   */
  EReference getOLSyntaxNode_ParallelStatement();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see jolie.xtext.jolie.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see jolie.xtext.jolie.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see jolie.xtext.jolie.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see jolie.xtext.jolie.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see jolie.xtext.jolie.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jolie.xtext.jolie.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see jolie.xtext.jolie.RealLiteral
   * @generated
   */
  EClass getRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.RealLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jolie.xtext.jolie.RealLiteral#getValue()
   * @see #getRealLiteral()
   * @generated
   */
  EAttribute getRealLiteral_Value();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String</em>'.
   * @see jolie.xtext.jolie.String
   * @generated
   */
  EClass getString();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.String#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jolie.xtext.jolie.String#getValue()
   * @see #getString()
   * @generated
   */
  EAttribute getString_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JolieFactory getJolieFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ProgramImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MAIN = eINSTANCE.getProgram_Main();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.MainImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>Mainrocess</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__MAINROCESS = eINSTANCE.getMain_Mainrocess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.MainProcessImpl <em>Main Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.MainProcessImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMainProcess()
     * @generated
     */
    EClass MAIN_PROCESS = eINSTANCE.getMainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ProcessImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__CHILDREN = eINSTANCE.getProcess_Children();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS = eINSTANCE.getProcess_Process();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ParallelStatementImpl <em>Parallel Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ParallelStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getParallelStatement()
     * @generated
     */
    EClass PARALLEL_STATEMENT = eINSTANCE.getParallelStatement();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL_STATEMENT__CHILDREN = eINSTANCE.getParallelStatement_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.SequenceStatementImpl <em>Sequence Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.SequenceStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSequenceStatement()
     * @generated
     */
    EClass SEQUENCE_STATEMENT = eINSTANCE.getSequenceStatement();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_STATEMENT__CHILDREN = eINSTANCE.getSequenceStatement_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.BasicStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBasicStatement()
     * @generated
     */
    EClass BASIC_STATEMENT = eINSTANCE.getBasicStatement();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.AssignStatementImpl <em>Assign Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.AssignStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatement()
     * @generated
     */
    EClass ASSIGN_STATEMENT = eINSTANCE.getAssignStatement();

    /**
     * The meta object literal for the '<em><b>Assign Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STATEMENT__ASSIGN_STATEMENT = eINSTANCE.getAssignStatement_AssignStatement();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STATEMENT__VARIABLE_PATH = eINSTANCE.getAssignStatement_VariablePath();

    /**
     * The meta object literal for the '<em><b>Right Side Assign</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STATEMENT__RIGHT_SIDE_ASSIGN = eINSTANCE.getAssignStatement_RightSideAssign();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RightSideAssignamentImpl <em>Right Side Assignament</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RightSideAssignamentImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRightSideAssignament()
     * @generated
     */
    EClass RIGHT_SIDE_ASSIGNAMENT = eINSTANCE.getRightSideAssignament();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ExpressionImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__PREFIX = eINSTANCE.getExpression_Prefix();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VARIABLE_PATH = eINSTANCE.getExpression_VariablePath();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.VariablePathImpl <em>Variable Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.VariablePathImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getVariablePath()
     * @generated
     */
    EClass VARIABLE_PATH = eINSTANCE.getVariablePath();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PATH__CHILDREN = eINSTANCE.getVariablePath_Children();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PATH__VARIABLE_PATH = eINSTANCE.getVariablePath_VariablePath();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl <em>ND Choice Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.NDChoiceStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getNDChoiceStatement()
     * @generated
     */
    EClass ND_CHOICE_STATEMENT = eINSTANCE.getNDChoiceStatement();

    /**
     * The meta object literal for the '<em><b>ND Choice Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT = eINSTANCE.getNDChoiceStatement_NDChoiceStatement();

    /**
     * The meta object literal for the '<em><b>Input Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__INPUT_OPERATION = eINSTANCE.getNDChoiceStatement_InputOperation();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__MAIN_PROCESS = eINSTANCE.getNDChoiceStatement_MainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InputOperationImpl <em>Input Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InputOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInputOperation()
     * @generated
     */
    EClass INPUT_OPERATION = eINSTANCE.getInputOperation();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RequestResponseOperationImpl <em>Request Response Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RequestResponseOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRequestResponseOperation()
     * @generated
     */
    EClass REQUEST_RESPONSE_OPERATION = eINSTANCE.getRequestResponseOperation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_RESPONSE_OPERATION__EXPRESSION = eINSTANCE.getRequestResponseOperation_Expression();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_RESPONSE_OPERATION__MAIN_PROCESS = eINSTANCE.getRequestResponseOperation_MainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OLSyntaxNodeImpl <em>OL Syntax Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OLSyntaxNodeImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOLSyntaxNode()
     * @generated
     */
    EClass OL_SYNTAX_NODE = eINSTANCE.getOLSyntaxNode();

    /**
     * The meta object literal for the '<em><b>Parallel Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OL_SYNTAX_NODE__PARALLEL_STATEMENT = eINSTANCE.getOLSyntaxNode_ParallelStatement();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.IntLiteralImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RealLiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RealLiteralImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRealLiteral()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.StringImpl <em>String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.StringImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getString()
     * @generated
     */
    EClass STRING = eINSTANCE.getString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING__VALUE = eINSTANCE.getString_Value();

  }

} //JoliePackage
