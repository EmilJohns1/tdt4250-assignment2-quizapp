/**
 */
package no.ntnu.tdt4250.spl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.spl.SplPackage
 * @generated
 */
public interface SplFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplFactory eINSTANCE = no.ntnu.tdt4250.spl.impl.SplFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quiz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quiz</em>'.
	 * @generated
	 */
	Quiz createQuiz();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Guest User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest User</em>'.
	 * @generated
	 */
	GuestUser createGuestUser();

	/**
	 * Returns a new object of class '<em>Logged In User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logged In User</em>'.
	 * @generated
	 */
	LoggedInUser createLoggedInUser();

	/**
	 * Returns a new object of class '<em>Quiz App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quiz App</em>'.
	 * @generated
	 */
	QuizApp createQuizApp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SplPackage getSplPackage();

} //SplFactory
