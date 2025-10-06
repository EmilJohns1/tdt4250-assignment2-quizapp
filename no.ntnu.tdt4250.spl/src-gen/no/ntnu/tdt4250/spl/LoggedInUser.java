/**
 */
package no.ntnu.tdt4250.spl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logged In User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.LoggedInUser#getUsername <em>Username</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.LoggedInUser#getProfilePictureURL <em>Profile Picture URL</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.LoggedInUser#getStreak <em>Streak</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.LoggedInUser#getComments <em>Comments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.LoggedInUser#getCreatedQuizzes <em>Created Quizzes</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.spl.SplPackage#getLoggedInUser()
 * @model
 * @generated
 */
public interface LoggedInUser extends User {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getLoggedInUser_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.LoggedInUser#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Profile Picture URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Picture URL</em>' attribute.
	 * @see #setProfilePictureURL(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getLoggedInUser_ProfilePictureURL()
	 * @model
	 * @generated
	 */
	String getProfilePictureURL();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.LoggedInUser#getProfilePictureURL <em>Profile Picture URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Picture URL</em>' attribute.
	 * @see #getProfilePictureURL()
	 * @generated
	 */
	void setProfilePictureURL(String value);

	/**
	 * Returns the value of the '<em><b>Streak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streak</em>' attribute.
	 * @see #setStreak(int)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getLoggedInUser_Streak()
	 * @model
	 * @generated
	 */
	int getStreak();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.LoggedInUser#getStreak <em>Streak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streak</em>' attribute.
	 * @see #getStreak()
	 * @generated
	 */
	void setStreak(int value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.Comment}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getLoggedInUser_Comments()
	 * @see no.ntnu.tdt4250.spl.Comment#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Created Quizzes</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.Quiz}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.Quiz#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Quizzes</em>' reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getLoggedInUser_CreatedQuizzes()
	 * @see no.ntnu.tdt4250.spl.Quiz#getCreatedBy
	 * @model opposite="createdBy"
	 * @generated
	 */
	EList<Quiz> getCreatedQuizzes();

} // LoggedInUser
