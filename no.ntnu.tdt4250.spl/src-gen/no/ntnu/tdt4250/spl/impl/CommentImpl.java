/**
 */
package no.ntnu.tdt4250.spl.impl;

import java.util.Date;

import no.ntnu.tdt4250.spl.Comment;
import no.ntnu.tdt4250.spl.LoggedInUser;
import no.ntnu.tdt4250.spl.Quiz;
import no.ntnu.tdt4250.spl.SplPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.CommentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.CommentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.CommentImpl#getQuiz <em>Quiz</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.CommentImpl#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.spl.impl.CommentImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected LoggedInUser author;

	/**
	 * The cached value of the '{@link #getQuiz() <em>Quiz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuiz()
	 * @generated
	 * @ordered
	 */
	protected Quiz quiz;

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
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggedInUser getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject) author;
			author = (LoggedInUser) eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplPackage.COMMENT__AUTHOR, oldAuthor,
							author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggedInUser basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(LoggedInUser newAuthor, NotificationChain msgs) {
		LoggedInUser oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__AUTHOR,
					oldAuthor, newAuthor);
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
	public void setAuthor(LoggedInUser newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject) author).eInverseRemove(this, SplPackage.LOGGED_IN_USER__COMMENTS,
						LoggedInUser.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject) newAuthor).eInverseAdd(this, SplPackage.LOGGED_IN_USER__COMMENTS,
						LoggedInUser.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quiz getQuiz() {
		if (quiz != null && quiz.eIsProxy()) {
			InternalEObject oldQuiz = (InternalEObject) quiz;
			quiz = (Quiz) eResolveProxy(oldQuiz);
			if (quiz != oldQuiz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplPackage.COMMENT__QUIZ, oldQuiz, quiz));
			}
		}
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quiz basicGetQuiz() {
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuiz(Quiz newQuiz, NotificationChain msgs) {
		Quiz oldQuiz = quiz;
		quiz = newQuiz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__QUIZ,
					oldQuiz, newQuiz);
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
	public void setQuiz(Quiz newQuiz) {
		if (newQuiz != quiz) {
			NotificationChain msgs = null;
			if (quiz != null)
				msgs = ((InternalEObject) quiz).eInverseRemove(this, SplPackage.QUIZ__COMMENTS, Quiz.class, msgs);
			if (newQuiz != null)
				msgs = ((InternalEObject) newQuiz).eInverseAdd(this, SplPackage.QUIZ__COMMENTS, Quiz.class, msgs);
			msgs = basicSetQuiz(newQuiz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__QUIZ, newQuiz, newQuiz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplPackage.COMMENT__TIMESTAMP, oldTimestamp,
					timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SplPackage.COMMENT__AUTHOR:
			if (author != null)
				msgs = ((InternalEObject) author).eInverseRemove(this, SplPackage.LOGGED_IN_USER__COMMENTS,
						LoggedInUser.class, msgs);
			return basicSetAuthor((LoggedInUser) otherEnd, msgs);
		case SplPackage.COMMENT__QUIZ:
			if (quiz != null)
				msgs = ((InternalEObject) quiz).eInverseRemove(this, SplPackage.QUIZ__COMMENTS, Quiz.class, msgs);
			return basicSetQuiz((Quiz) otherEnd, msgs);
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
		case SplPackage.COMMENT__AUTHOR:
			return basicSetAuthor(null, msgs);
		case SplPackage.COMMENT__QUIZ:
			return basicSetQuiz(null, msgs);
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
		case SplPackage.COMMENT__CONTENT:
			return getContent();
		case SplPackage.COMMENT__AUTHOR:
			if (resolve)
				return getAuthor();
			return basicGetAuthor();
		case SplPackage.COMMENT__QUIZ:
			if (resolve)
				return getQuiz();
			return basicGetQuiz();
		case SplPackage.COMMENT__ID:
			return getId();
		case SplPackage.COMMENT__TIMESTAMP:
			return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SplPackage.COMMENT__CONTENT:
			setContent((String) newValue);
			return;
		case SplPackage.COMMENT__AUTHOR:
			setAuthor((LoggedInUser) newValue);
			return;
		case SplPackage.COMMENT__QUIZ:
			setQuiz((Quiz) newValue);
			return;
		case SplPackage.COMMENT__ID:
			setId((Integer) newValue);
			return;
		case SplPackage.COMMENT__TIMESTAMP:
			setTimestamp((Date) newValue);
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
		case SplPackage.COMMENT__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case SplPackage.COMMENT__AUTHOR:
			setAuthor((LoggedInUser) null);
			return;
		case SplPackage.COMMENT__QUIZ:
			setQuiz((Quiz) null);
			return;
		case SplPackage.COMMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case SplPackage.COMMENT__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
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
		case SplPackage.COMMENT__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case SplPackage.COMMENT__AUTHOR:
			return author != null;
		case SplPackage.COMMENT__QUIZ:
			return quiz != null;
		case SplPackage.COMMENT__ID:
			return id != ID_EDEFAULT;
		case SplPackage.COMMENT__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", id: ");
		result.append(id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
