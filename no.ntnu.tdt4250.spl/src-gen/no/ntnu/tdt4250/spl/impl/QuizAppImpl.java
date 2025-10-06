/**
 */
package no.ntnu.tdt4250.spl.impl;

import java.util.Collection;

import no.ntnu.tdt4250.spl.Comment;
import no.ntnu.tdt4250.spl.Quiz;
import no.ntnu.tdt4250.spl.QuizApp;
import no.ntnu.tdt4250.spl.SplPackage;
import no.ntnu.tdt4250.spl.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl#getUser <em>User</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl#getQuiz <em>Quiz</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl#getTotalQuizzes <em>Total Quizzes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizAppImpl extends MinimalEObjectImpl.Container implements QuizApp {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getQuiz() <em>Quiz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuiz()
	 * @generated
	 * @ordered
	 */
	protected EList<Quiz> quiz;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * The default value of the '{@link #getTotalQuizzes() <em>Total Quizzes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuizzes()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_QUIZZES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplPackage.Literals.QUIZ_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ_APP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, SplPackage.QUIZ_APP__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quiz> getQuiz() {
		if (quiz == null) {
			quiz = new EObjectContainmentEList<Quiz>(Quiz.class, this, SplPackage.QUIZ_APP__QUIZ);
		}
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this, SplPackage.QUIZ_APP__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getTotalQuizzes() {
		if (getQuiz() == null || getQuiz().isEmpty()) {
			return 0;
		} else {
			return getQuiz().size();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SplPackage.QUIZ_APP__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case SplPackage.QUIZ_APP__QUIZ:
			return ((InternalEList<?>) getQuiz()).basicRemove(otherEnd, msgs);
		case SplPackage.QUIZ_APP__COMMENT:
			return ((InternalEList<?>) getComment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SplPackage.QUIZ_APP__NAME:
			return getName();
		case SplPackage.QUIZ_APP__USER:
			return getUser();
		case SplPackage.QUIZ_APP__QUIZ:
			return getQuiz();
		case SplPackage.QUIZ_APP__COMMENT:
			return getComment();
		case SplPackage.QUIZ_APP__TOTAL_QUIZZES:
			return getTotalQuizzes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SplPackage.QUIZ_APP__NAME:
			setName((String) newValue);
			return;
		case SplPackage.QUIZ_APP__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case SplPackage.QUIZ_APP__QUIZ:
			getQuiz().clear();
			getQuiz().addAll((Collection<? extends Quiz>) newValue);
			return;
		case SplPackage.QUIZ_APP__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends Comment>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SplPackage.QUIZ_APP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SplPackage.QUIZ_APP__USER:
			getUser().clear();
			return;
		case SplPackage.QUIZ_APP__QUIZ:
			getQuiz().clear();
			return;
		case SplPackage.QUIZ_APP__COMMENT:
			getComment().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SplPackage.QUIZ_APP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SplPackage.QUIZ_APP__USER:
			return user != null && !user.isEmpty();
		case SplPackage.QUIZ_APP__QUIZ:
			return quiz != null && !quiz.isEmpty();
		case SplPackage.QUIZ_APP__COMMENT:
			return comment != null && !comment.isEmpty();
		case SplPackage.QUIZ_APP__TOTAL_QUIZZES:
			return getTotalQuizzes() != TOTAL_QUIZZES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QuizAppImpl
