/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jolie.xtext.jolie.JoliePackage
 * @generated
 */
public interface JolieFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JolieFactory eINSTANCE = jolie.xtext.jolie.impl.JolieFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>TYPEDEF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TYPEDEF</em>'.
   * @generated
   */
  TYPEDEF createTYPEDEF();

  /**
   * Returns a new object of class '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main</em>'.
   * @generated
   */
  Main createMain();

  /**
   * Returns a new object of class '<em>Main Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Process</em>'.
   * @generated
   */
  MainProcess createMainProcess();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Parallel Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel Statement</em>'.
   * @generated
   */
  ParallelStatement createParallelStatement();

  /**
   * Returns a new object of class '<em>Sequence Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Statement</em>'.
   * @generated
   */
  SequenceStatement createSequenceStatement();

  /**
   * Returns a new object of class '<em>Basic Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Statement</em>'.
   * @generated
   */
  BasicStatement createBasicStatement();

  /**
   * Returns a new object of class '<em>Assign Statement Or Post Increment Decrement Or Input Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Statement Or Post Increment Decrement Or Input Operation</em>'.
   * @generated
   */
  AssignStatementOrPostIncrementDecrementOrInputOperation createAssignStatementOrPostIncrementDecrementOrInputOperation();

  /**
   * Returns a new object of class '<em>Right Side</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Side</em>'.
   * @generated
   */
  RightSide createRightSide();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Pre Increment Decrement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Increment Decrement</em>'.
   * @generated
   */
  PreIncrementDecrement createPreIncrementDecrement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Variable Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Path</em>'.
   * @generated
   */
  VariablePath createVariablePath();

  /**
   * Returns a new object of class '<em>With</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With</em>'.
   * @generated
   */
  With createWith();

  /**
   * Returns a new object of class '<em>ND Choice Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ND Choice Statement</em>'.
   * @generated
   */
  NDChoiceStatement createNDChoiceStatement();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Input Port Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Port Statement</em>'.
   * @generated
   */
  InputPortStatement createInputPortStatement();

  /**
   * Returns a new object of class '<em>Output Port Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Port Statement</em>'.
   * @generated
   */
  OutputPortStatement createOutputPortStatement();

  /**
   * Returns a new object of class '<em>One Way Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One Way Operation</em>'.
   * @generated
   */
  OneWayOperation createOneWayOperation();

  /**
   * Returns a new object of class '<em>Request Response Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request Response Operation</em>'.
   * @generated
   */
  RequestResponseOperation createRequestResponseOperation();

  /**
   * Returns a new object of class '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Definition</em>'.
   * @generated
   */
  TypeDefinition createTypeDefinition();

  /**
   * Returns a new object of class '<em>Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location</em>'.
   * @generated
   */
  Location createLocation();

  /**
   * Returns a new object of class '<em>Uri</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uri</em>'.
   * @generated
   */
  Uri createUri();

  /**
   * Returns a new object of class '<em>Interfaces</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interfaces</em>'.
   * @generated
   */
  Interfaces createInterfaces();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Redirects</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Redirects</em>'.
   * @generated
   */
  Redirects createRedirects();

  /**
   * Returns a new object of class '<em>Aggregates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregates</em>'.
   * @generated
   */
  Aggregates createAggregates();

  /**
   * Returns a new object of class '<em>OL Syntax Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OL Syntax Node</em>'.
   * @generated
   */
  OLSyntaxNode createOLSyntaxNode();

  /**
   * Returns a new object of class '<em>Assign Statement Or Post Increment Decrement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Statement Or Post Increment Decrement</em>'.
   * @generated
   */
  AssignStatementOrPostIncrementDecrement createAssignStatementOrPostIncrementDecrement();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String</em>'.
   * @generated
   */
  String createString();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JoliePackage getJoliePackage();

} //JolieFactory
