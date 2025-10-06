/**
 */
package no.ntnu.tdt4250.spl.impl;

import java.util.Collection;
import java.util.Date;

import no.ntnu.tdt4250.spl.Comment;
import no.ntnu.tdt4250.spl.LoggedInUser;
import no.ntnu.tdt4250.spl.Quiz;
import no.ntnu.tdt4250.spl.SplPackage;
import no.ntnu.tdt4250.spl.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getAttemptedBy <em>Attempted By</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.QuizImpl#getCreatedDate <em>Created Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizImpl extends MinimalEObjectImpl.Container implements Quiz {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected LoggedInUser createdBy;

	/**
	 * The cached value of the '{@link #getAttemptedBy() <em>Attempted By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<User> attemptedBy;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplPackage.Literals.QUIZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggedInUser getCreatedBy() {
		if (createdBy != null && createdBy.eIsProxy()) {
			InternalEObject oldCreatedBy = (InternalEObject) createdBy;
			createdBy = (LoggedInUser) eResolveProxy(oldCreatedBy);
			if (createdBy != oldCreatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplPackage.QUIZ__CREATED_BY, oldCreatedBy,
							createdBy));
			}
		}
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggedInUser basicGetCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatedBy(LoggedInUser newCreatedBy, NotificationChain msgs) {
		LoggedInUser oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ__CREATED_BY,
					oldCreatedBy, newCreatedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(LoggedInUser newCreatedBy) {
		if (newCreatedBy != createdBy) {
			NotificationChain msgs = null;
			if (createdBy != null)
				msgs = ((InternalEObject) createdBy).eInverseRemove(this, SplPackage.LOGGED_IN_USER__CREATED_QUIZZES,
						LoggedInUser.class, msgs);
			if (newCreatedBy != null)
				msgs = ((InternalEObject) newCreatedBy).eInverseAdd(this, SplPackage.LOGGED_IN_USER__CREATED_QUIZZES,
						LoggedInUser.class, msgs);
			msgs = basicSetCreatedBy(newCreatedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ__CREATED_BY, newCreatedBy,
					newCreatedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getAttemptedBy() {
		if (attemptedBy == null) {
			attemptedBy = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this,
					SplPackage.QUIZ__ATTEMPTED_BY, SplPackage.USER__ATTEMPTED_QUIZZES);
		}
		return attemptedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectWithInverseResolvingEList<Comment>(Comment.class, this, SplPackage.QUIZ__COMMENTS,
					SplPackage.COMMENT__QUIZ);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.QUIZ__CREATED_DATE, oldCreatedDate,
					createdDate));
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
		case SplPackage.QUIZ__CREATED_BY:
			if (createdBy != null)
				msgs = ((InternalEObject) createdBy).eInverseRemove(this, SplPackage.LOGGED_IN_USER__CREATED_QUIZZES,
						LoggedInUser.class, msgs);
			return basicSetCreatedBy((LoggedInUser) otherEnd, msgs);
		case SplPackage.QUIZ__ATTEMPTED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttemptedBy()).basicAdd(otherEnd, msgs);
		case SplPackage.QUIZ__COMMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComments()).basicAdd(otherEnd, msgs);
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
		case SplPackage.QUIZ__CREATED_BY:
			return basicSetCreatedBy(null, msgs);
		case SplPackage.QUIZ__ATTEMPTED_BY:
			return ((InternalEList<?>) getAttemptedBy()).basicRemove(otherEnd, msgs);
		case SplPackage.QUIZ__COMMENTS:
			return ((InternalEList<?>) getComments()).basicRemove(otherEnd, msgs);
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
		case SplPackage.QUIZ__TITLE:
			return getTitle();
		case SplPackage.QUIZ__DESCRIPTION:
			return getDescription();
		case SplPackage.QUIZ__CREATED_BY:
			if (resolve)
				return getCreatedBy();
			return basicGetCreatedBy();
		case SplPackage.QUIZ__ATTEMPTED_BY:
			return getAttemptedBy();
		case SplPackage.QUIZ__COMMENTS:
			return getComments();
		case SplPackage.QUIZ__ID:
			return getId();
		case SplPackage.QUIZ__CREATED_DATE:
			return getCreatedDate();
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
		case SplPackage.QUIZ__TITLE:
			setTitle((String) newValue);
			return;
		case SplPackage.QUIZ__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SplPackage.QUIZ__CREATED_BY:
			setCreatedBy((LoggedInUser) newValue);
			return;
		case SplPackage.QUIZ__ATTEMPTED_BY:
			getAttemptedBy().clear();
			getAttemptedBy().addAll((Collection<? extends User>) newValue);
			return;
		case SplPackage.QUIZ__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case SplPackage.QUIZ__ID:
			setId((Integer) newValue);
			return;
		case SplPackage.QUIZ__CREATED_DATE:
			setCreatedDate((Date) newValue);
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
		case SplPackage.QUIZ__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case SplPackage.QUIZ__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SplPackage.QUIZ__CREATED_BY:
			setCreatedBy((LoggedInUser) null);
			return;
		case SplPackage.QUIZ__ATTEMPTED_BY:
			getAttemptedBy().clear();
			return;
		case SplPackage.QUIZ__COMMENTS:
			getComments().clear();
			return;
		case SplPackage.QUIZ__ID:
			setId(ID_EDEFAULT);
			return;
		case SplPackage.QUIZ__CREATED_DATE:
			setCreatedDate(CREATED_DATE_EDEFAULT);
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
		case SplPackage.QUIZ__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case SplPackage.QUIZ__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SplPackage.QUIZ__CREATED_BY:
			return createdBy != null;
		case SplPackage.QUIZ__ATTEMPTED_BY:
			return attemptedBy != null && !attemptedBy.isEmpty();
		case SplPackage.QUIZ__COMMENTS:
			return comments != null && !comments.isEmpty();
		case SplPackage.QUIZ__ID:
			return id != ID_EDEFAULT;
		case SplPackage.QUIZ__CREATED_DATE:
			return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(')');
		return result.toString();
	}

} //QuizImpl
