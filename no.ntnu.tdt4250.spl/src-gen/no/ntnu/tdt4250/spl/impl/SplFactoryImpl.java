/**
 */
package no.ntnu.tdt4250.spl.impl;

import no.ntnu.tdt4250.spl.*;

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
public class SplFactoryImpl extends EFactoryImpl implements SplFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SplFactory init() {
		try {
			SplFactory theSplFactory = (SplFactory) EPackage.Registry.INSTANCE.getEFactory(SplPackage.eNS_URI);
			if (theSplFactory != null) {
				return theSplFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SplFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SplPackage.QUIZ:
			return createQuiz();
		case SplPackage.COMMENT:
			return createComment();
		case SplPackage.GUEST_USER:
			return createGuestUser();
		case SplPackage.LOGGED_IN_USER:
			return createLoggedInUser();
		case SplPackage.QUIZ_APP:
			return createQuizApp();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quiz createQuiz() {
		QuizImpl quiz = new QuizImpl();
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuestUser createGuestUser() {
		GuestUserImpl guestUser = new GuestUserImpl();
		return guestUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggedInUser createLoggedInUser() {
		LoggedInUserImpl loggedInUser = new LoggedInUserImpl();
		return loggedInUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuizApp createQuizApp() {
		QuizAppImpl quizApp = new QuizAppImpl();
		return quizApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplPackage getSplPackage() {
		return (SplPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SplPackage getPackage() {
		return SplPackage.eINSTANCE;
	}

} //SplFactoryImpl
