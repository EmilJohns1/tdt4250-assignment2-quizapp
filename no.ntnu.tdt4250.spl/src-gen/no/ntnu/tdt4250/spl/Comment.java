/**
 */
package no.ntnu.tdt4250.spl;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.Comment#getContent <em>Content</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Comment#getAuthor <em>Author</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Comment#getQuiz <em>Quiz</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Comment#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.Comment#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.spl.SplPackage#getComment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='commentAuthorMustHaveCompletedQuizToComment'"
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getComment_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Comment#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.LoggedInUser#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(LoggedInUser)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getComment_Author()
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getComments
	 * @model opposite="comments" required="true"
	 * @generated
	 */
	LoggedInUser getAuthor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Comment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(LoggedInUser value);

	/**
	 * Returns the value of the '<em><b>Quiz</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.Quiz#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quiz</em>' reference.
	 * @see #setQuiz(Quiz)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getComment_Quiz()
	 * @see no.ntnu.tdt4250.spl.Quiz#getComments
	 * @model opposite="comments" required="true"
	 * @generated
	 */
	Quiz getQuiz();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Comment#getQuiz <em>Quiz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quiz</em>' reference.
	 * @see #getQuiz()
	 * @generated
	 */
	void setQuiz(Quiz value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getComment_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Comment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getComment_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.Comment#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // Comment
