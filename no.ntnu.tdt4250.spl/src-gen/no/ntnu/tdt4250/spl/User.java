/**
 */
package no.ntnu.tdt4250.spl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.User#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.User#getAttemptedQuizzes <em>Attempted Quizzes</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.spl.SplPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see no.ntnu.tdt4250.spl.SplPackage#getUser_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.spl.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Attempted Quizzes</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.spl.Quiz}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.spl.Quiz#getAttemptedBy <em>Attempted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempted Quizzes</em>' reference list.
	 * @see no.ntnu.tdt4250.spl.SplPackage#getUser_AttemptedQuizzes()
	 * @see no.ntnu.tdt4250.spl.Quiz#getAttemptedBy
	 * @model opposite="attemptedBy"
	 * @generated
	 */
	EList<Quiz> getAttemptedQuizzes();

} // User
