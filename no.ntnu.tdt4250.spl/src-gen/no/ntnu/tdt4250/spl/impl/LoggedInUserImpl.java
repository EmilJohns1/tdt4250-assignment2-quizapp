/**
 */
package no.ntnu.tdt4250.spl.impl;

import java.util.Collection;

import no.ntnu.tdt4250.spl.Comment;
import no.ntnu.tdt4250.spl.LoggedInUser;
import no.ntnu.tdt4250.spl.Quiz;
import no.ntnu.tdt4250.spl.SplPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logged In User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl#getProfilePictureURL <em>Profile Picture URL</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl#getStreak <em>Streak</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl#getCreatedQuizzes <em>Created Quizzes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoggedInUserImpl extends UserImpl implements LoggedInUser {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfilePictureURL() <em>Profile Picture URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfilePictureURL()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_PICTURE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfilePictureURL() <em>Profile Picture URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfilePictureURL()
	 * @generated
	 * @ordered
	 */
	protected String profilePictureURL = PROFILE_PICTURE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreak() <em>Streak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreak()
	 * @generated
	 * @ordered
	 */
	protected static final int STREAK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStreak() <em>Streak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreak()
	 * @generated
	 * @ordered
	 */
	protected int streak = STREAK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getCreatedQuizzes() <em>Created Quizzes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedQuizzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Quiz> createdQuizzes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoggedInUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplPackage.Literals.LOGGED_IN_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.LOGGED_IN_USER__USERNAME, oldUsername,
					username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfilePictureURL() {
		return profilePictureURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfilePictureURL(String newProfilePictureURL) {
		String oldProfilePictureURL = profilePictureURL;
		profilePictureURL = newProfilePictureURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.LOGGED_IN_USER__PROFILE_PICTURE_URL,
					oldProfilePictureURL, profilePictureURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStreak() {
		return streak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreak(int newStreak) {
		int oldStreak = streak;
		streak = newStreak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.LOGGED_IN_USER__STREAK, oldStreak,
					streak));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectWithInverseResolvingEList<Comment>(Comment.class, this,
					SplPackage.LOGGED_IN_USER__COMMENTS, SplPackage.COMMENT__AUTHOR);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quiz> getCreatedQuizzes() {
		if (createdQuizzes == null) {
			createdQuizzes = new EObjectWithInverseResolvingEList<Quiz>(Quiz.class, this,
					SplPackage.LOGGED_IN_USER__CREATED_QUIZZES, SplPackage.QUIZ__CREATED_BY);
		}
		return createdQuizzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SplPackage.LOGGED_IN_USER__COMMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComments()).basicAdd(otherEnd, msgs);
		case SplPackage.LOGGED_IN_USER__CREATED_QUIZZES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCreatedQuizzes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SplPackage.LOGGED_IN_USER__COMMENTS:
			return ((InternalEList<?>) getComments()).basicRemove(otherEnd, msgs);
		case SplPackage.LOGGED_IN_USER__CREATED_QUIZZES:
			return ((InternalEList<?>) getCreatedQuizzes()).basicRemove(otherEnd, msgs);
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
		case SplPackage.LOGGED_IN_USER__USERNAME:
			return getUsername();
		case SplPackage.LOGGED_IN_USER__PROFILE_PICTURE_URL:
			return getProfilePictureURL();
		case SplPackage.LOGGED_IN_USER__STREAK:
			return getStreak();
		case SplPackage.LOGGED_IN_USER__COMMENTS:
			return getComments();
		case SplPackage.LOGGED_IN_USER__CREATED_QUIZZES:
			return getCreatedQuizzes();
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
		case SplPackage.LOGGED_IN_USER__USERNAME:
			setUsername((String) newValue);
			return;
		case SplPackage.LOGGED_IN_USER__PROFILE_PICTURE_URL:
			setProfilePictureURL((String) newValue);
			return;
		case SplPackage.LOGGED_IN_USER__STREAK:
			setStreak((Integer) newValue);
			return;
		case SplPackage.LOGGED_IN_USER__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case SplPackage.LOGGED_IN_USER__CREATED_QUIZZES:
			getCreatedQuizzes().clear();
			getCreatedQuizzes().addAll((Collection<? extends Quiz>) newValue);
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
		case SplPackage.LOGGED_IN_USER__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case SplPackage.LOGGED_IN_USER__PROFILE_PICTURE_URL:
			setProfilePictureURL(PROFILE_PICTURE_URL_EDEFAULT);
			return;
		case SplPackage.LOGGED_IN_USER__STREAK:
			setStreak(STREAK_EDEFAULT);
			return;
		case SplPackage.LOGGED_IN_USER__COMMENTS:
			getComments().clear();
			return;
		case SplPackage.LOGGED_IN_USER__CREATED_QUIZZES:
			getCreatedQuizzes().clear();
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
		case SplPackage.LOGGED_IN_USER__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case SplPackage.LOGGED_IN_USER__PROFILE_PICTURE_URL:
			return PROFILE_PICTURE_URL_EDEFAULT == null ? profilePictureURL != null
					: !PROFILE_PICTURE_URL_EDEFAULT.equals(profilePictureURL);
		case SplPackage.LOGGED_IN_USER__STREAK:
			return streak != STREAK_EDEFAULT;
		case SplPackage.LOGGED_IN_USER__COMMENTS:
			return comments != null && !comments.isEmpty();
		case SplPackage.LOGGED_IN_USER__CREATED_QUIZZES:
			return createdQuizzes != null && !createdQuizzes.isEmpty();
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
		result.append(" (username: ");
		result.append(username);
		result.append(", profilePictureURL: ");
		result.append(profilePictureURL);
		result.append(", streak: ");
		result.append(streak);
		result.append(')');
		return result.toString();
	}

} //LoggedInUserImpl
