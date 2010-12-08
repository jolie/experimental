/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.util;

import java.util.List;

import jolie.xtext.jolie.AssignStatement;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.IntLiteral;
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
public class JolieSwitch<T> {

    
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
    public JolieSwitch() {
        if (modelPackage == null) {
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
    public T doSwitch(EObject theEObject) {
       /*Modified from Diego to Switch all the Model*/
        for (EObject eobj : theEObject.eContents()) {
            doSwitch(eobj);
        }
       /*And of modify from Diego*/
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty()
                    ? defaultCase(theEObject)
                    : doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {

        switch (classifierID) {
            case JoliePackage.PROGRAM: {

                Program program = (Program) theEObject;
                T result = caseProgram(program);
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.MAIN: {

                Main main = (Main) theEObject;
                T result = caseMain(main);
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.MAIN_PROCESS: {

                MainProcess mainProcess = (MainProcess) theEObject;
                T result = caseMainProcess(mainProcess);
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.PROCESS: {
                jolie.xtext.jolie.Process process = (jolie.xtext.jolie.Process) theEObject;
                T result = caseProcess(process);
                if (result == null) {
                    result = caseBasicStatement(process);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.PARALLEL_STATEMENT: {

                ParallelStatement parallelStatement = (ParallelStatement) theEObject;
                T result = caseParallelStatement(parallelStatement);
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.SEQUENCE_STATEMENT: {
                SequenceStatement sequenceStatement = (SequenceStatement) theEObject;
                T result = caseSequenceStatement(sequenceStatement);
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.BASIC_STATEMENT: {
                BasicStatement basicStatement = (BasicStatement) theEObject;
                T result = caseBasicStatement(basicStatement);
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.ASSIGN_STATEMENT: {
                AssignStatement assignStatement = (AssignStatement) theEObject;
                T result = caseAssignStatement(assignStatement);
                if (result == null) {
                    result = caseBasicStatement(assignStatement);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.POST_INCREMENT_STATEMENT: {
                PostIncrementStatement postIncrementStatement = (PostIncrementStatement) theEObject;
                T result = casePostIncrementStatement(postIncrementStatement);
                if (result == null) {
                    result = caseBasicStatement(postIncrementStatement);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.POST_DECREMENT_STATEMENT: {
                PostDecrementStatement postDecrementStatement = (PostDecrementStatement) theEObject;
                T result = casePostDecrementStatement(postDecrementStatement);
                if (result == null) {
                    result = caseBasicStatement(postDecrementStatement);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.EXPRESSION: {
                Expression expression = (Expression) theEObject;
                T result = caseExpression(expression);
                if (result == null) {
                    result = caseAssignStatement(expression);
                }
                if (result == null) {
                    result = caseBasicStatement(expression);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.OL_SYNTAX_NODE: {
                OLSyntaxNode olSyntaxNode = (OLSyntaxNode) theEObject;
                T result = caseOLSyntaxNode(olSyntaxNode);
                if (result == null) {
                    result = caseMainProcess(olSyntaxNode);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.OPERATION: {
                Operation operation = (Operation) theEObject;
                T result = caseOperation(operation);
                if (result == null) {
                    result = caseExpression(operation);
                }
                if (result == null) {
                    result = caseAssignStatement(operation);
                }
                if (result == null) {
                    result = caseBasicStatement(operation);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.INT_LITERAL: {
                IntLiteral intLiteral = (IntLiteral) theEObject;
                T result = caseIntLiteral(intLiteral);
                if (result == null) {
                    result = caseExpression(intLiteral);
                }
                if (result == null) {
                    result = caseAssignStatement(intLiteral);
                }
                if (result == null) {
                    result = caseBasicStatement(intLiteral);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.REAL_LITERAL: {
                RealLiteral realLiteral = (RealLiteral) theEObject;
                T result = caseRealLiteral(realLiteral);
                if (result == null) {
                    result = caseExpression(realLiteral);
                }
                if (result == null) {
                    result = caseAssignStatement(realLiteral);
                }
                if (result == null) {
                    result = caseBasicStatement(realLiteral);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            case JoliePackage.STRING: {
                jolie.xtext.jolie.String string = (jolie.xtext.jolie.String) theEObject;
                T result = caseString(string);
                if (result == null) {
                    result = caseExpression(string);
                }
                if (result == null) {
                    result = caseAssignStatement(string);
                }
                if (result == null) {
                    result = caseBasicStatement(string);
                }
                if (result == null) {
                    result = defaultCase(theEObject);
                }
                return result;
            }
            default:
                return defaultCase(theEObject);
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
    public T caseProgram(Program object) {
        System.out.println("Interpreto un Program");
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
    public T caseMain(Main object) {
        System.out.println("Interpreto un Main");
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
    public T caseMainProcess(MainProcess object) {
        System.out.println("Interpreto un MainProcess");
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
    public T caseProcess(jolie.xtext.jolie.Process object) {
        System.out.println("Interpreto un Process");
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
    public T caseParallelStatement(ParallelStatement object) {
        System.out.println("Interpreto un ParallelStatement");
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
    public T caseSequenceStatement(SequenceStatement object) {
        System.out.println("Interpreto un SequenceStatement");
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
    public T caseBasicStatement(BasicStatement object) {
        System.out.println("Interpreto un BasicStatement");
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assign Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assign Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignStatement(AssignStatement object) {
        System.out.println("Interpreto un AssignStatement");
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Post Increment Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Post Increment Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePostIncrementStatement(PostIncrementStatement object) {
        System.out.println("Interpreto un PostIncrementStatement");
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Post Decrement Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Post Decrement Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePostDecrementStatement(PostDecrementStatement object) {
        System.out.println("Interpreto un PostDecrementStatement");
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
    public T caseExpression(Expression object) {

        System.out.println("Interpreto un Expression");
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
    public T caseOLSyntaxNode(OLSyntaxNode object) {
        System.out.println("Interpreto un OLSyntaxNode");
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
    public T caseOperation(Operation object) {
        System.out.println("Interpreto un Operation");
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
    public T caseIntLiteral(IntLiteral object) {
        System.out.println("Interpreto un Operation");
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
    public T caseRealLiteral(RealLiteral object) {
        System.out.println("Interpreto un RealLiteral");
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
    public T caseString(jolie.xtext.jolie.String object) {
        System.out.println("Interpreto un String");
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
    public T defaultCase(EObject object) {
        return null;
    }
} //JolieSwitch

