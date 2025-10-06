/**
 */
package no.ntnu.tdt4250.spl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.QuizApp#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.QuizApp#getUser <em>User</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.QuizApp#getQuiz <em>Quiz</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.QuizApp#getComment <em>Comment</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.QuizApp#getTotalQuizzes <em>Total Quizzes</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.spl.SplPackage#getQuizApp()
 * @model
 * @generated
 */
public interface QuizApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuizApp_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.QuizApp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuizApp_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Quiz</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.Quiz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quiz</em>' containment reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuizApp_Quiz()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quiz> getQuiz();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuizApp_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComment();

	/**
	 * Returns the value of the '<em><b>Total Quizzes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Quizzes</em>' attribute.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuizApp_TotalQuizzes()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalQuizzes();

} // QuizApp
