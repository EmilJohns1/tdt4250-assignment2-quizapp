/**
 */
package no.ntnu.tdt4250.spl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getDescription <em>Description</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getAttemptedBy <em>Attempted By</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getComments <em>Comments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Quiz#getCreatedDate <em>Created Date</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz()
 * @model
 * @generated
 */
public interface Quiz extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Quiz#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Quiz#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.LoggedInUser#getCreatedQuizzes <em>Created Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(LoggedInUser)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_CreatedBy()
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getCreatedQuizzes
	 * @model opposite="createdQuizzes" required="true"
	 * @generated
	 */
	LoggedInUser getCreatedBy();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Quiz#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(LoggedInUser value);

	/**
	 * Returns the value of the '<em><b>Attempted By</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.User}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.User#getAttemptedQuizzes <em>Attempted Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempted By</em>' reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_AttemptedBy()
	 * @see no.ntnu.tdt4250.spl.User#getAttemptedQuizzes
	 * @model opposite="attemptedQuizzes"
	 * @generated
	 */
	EList<User> getAttemptedBy();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.Comment}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.Comment#getQuiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_Comments()
	 * @see no.ntnu.tdt4250.spl.Comment#getQuiz
	 * @model opposite="quiz"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Quiz#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getQuiz_CreatedDate()
	 * @model required="true"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Quiz#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

} // Quiz
