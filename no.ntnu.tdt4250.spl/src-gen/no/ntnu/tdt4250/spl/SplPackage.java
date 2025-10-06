/**
 */
package no.ntnu.tdt4250.spl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.spl.SplFactory
 * @model kind="package"
 * @generated
 */
public interface SplPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/tdt4250/spl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplPackage eINSTANCE = no.ntnu.tdt4250.spl.impl.SplPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.spl.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.spl.impl.UserImpl
	 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Attempted Quizzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ATTEMPTED_QUIZZES = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.spl.impl.QuizImpl <em>Quiz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.spl.impl.QuizImpl
	 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getQuiz()
	 * @generated
	 */
	int QUIZ = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__CREATED_BY = 2;

	/**
	 * The feature id for the '<em><b>Attempted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__ATTEMPTED_BY = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__ID = 5;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__CREATED_DATE = 6;

	/**
	 * The number of structural features of the '<em>Quiz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Quiz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.spl.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.spl.impl.CommentImpl
	 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Quiz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__QUIZ = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TIMESTAMP = 4;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.spl.impl.GuestUserImpl <em>Guest User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.spl.impl.GuestUserImpl
	 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getGuestUser()
	 * @generated
	 */
	int GUEST_USER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_USER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Attempted Quizzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_USER__ATTEMPTED_QUIZZES = USER__ATTEMPTED_QUIZZES;

	/**
	 * The number of structural features of the '<em>Guest User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guest User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl <em>Logged In User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.spl.impl.LoggedInUserImpl
	 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getLoggedInUser()
	 * @generated
	 */
	int LOGGED_IN_USER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Attempted Quizzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__ATTEMPTED_QUIZZES = USER__ATTEMPTED_QUIZZES;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__USERNAME = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile Picture URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__PROFILE_PICTURE_URL = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Streak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__STREAK = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__COMMENTS = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created Quizzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER__CREATED_QUIZZES = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Logged In User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Logged In User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_IN_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl <em>Quiz App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.spl.impl.QuizAppImpl
	 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getQuizApp()
	 * @generated
	 */
	int QUIZ_APP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP__USER = 1;

	/**
	 * The feature id for the '<em><b>Quiz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP__QUIZ = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Total Quizzes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP__TOTAL_QUIZZES = 4;

	/**
	 * The number of structural features of the '<em>Quiz App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Quiz App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_APP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.spl.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see no.ntnu.tdt4250.spl.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see no.ntnu.tdt4250.spl.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.spl.User#getAttemptedQuizzes <em>Attempted Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attempted Quizzes</em>'.
	 * @see no.ntnu.tdt4250.spl.User#getAttemptedQuizzes()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_AttemptedQuizzes();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.spl.Quiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz
	 * @generated
	 */
	EClass getQuiz();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Quiz#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getTitle()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Title();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Quiz#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getDescription()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Description();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.spl.Quiz#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getCreatedBy()
	 * @see #getQuiz()
	 * @generated
	 */
	EReference getQuiz_CreatedBy();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.spl.Quiz#getAttemptedBy <em>Attempted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attempted By</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getAttemptedBy()
	 * @see #getQuiz()
	 * @generated
	 */
	EReference getQuiz_AttemptedBy();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.spl.Quiz#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getComments()
	 * @see #getQuiz()
	 * @generated
	 */
	EReference getQuiz_Comments();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Quiz#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getId()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Id();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Quiz#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see no.ntnu.tdt4250.spl.Quiz#getCreatedDate()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_CreatedDate();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.spl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see no.ntnu.tdt4250.spl.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see no.ntnu.tdt4250.spl.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.spl.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see no.ntnu.tdt4250.spl.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Author();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.spl.Comment#getQuiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quiz</em>'.
	 * @see no.ntnu.tdt4250.spl.Comment#getQuiz()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Quiz();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Comment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see no.ntnu.tdt4250.spl.Comment#getId()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Id();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.Comment#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see no.ntnu.tdt4250.spl.Comment#getTimestamp()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Timestamp();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.spl.GuestUser <em>Guest User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest User</em>'.
	 * @see no.ntnu.tdt4250.spl.GuestUser
	 * @generated
	 */
	EClass getGuestUser();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.spl.LoggedInUser <em>Logged In User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logged In User</em>'.
	 * @see no.ntnu.tdt4250.spl.LoggedInUser
	 * @generated
	 */
	EClass getLoggedInUser();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.LoggedInUser#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getUsername()
	 * @see #getLoggedInUser()
	 * @generated
	 */
	EAttribute getLoggedInUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.LoggedInUser#getProfilePictureURL <em>Profile Picture URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Picture URL</em>'.
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getProfilePictureURL()
	 * @see #getLoggedInUser()
	 * @generated
	 */
	EAttribute getLoggedInUser_ProfilePictureURL();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.LoggedInUser#getStreak <em>Streak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Streak</em>'.
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getStreak()
	 * @see #getLoggedInUser()
	 * @generated
	 */
	EAttribute getLoggedInUser_Streak();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.spl.LoggedInUser#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getComments()
	 * @see #getLoggedInUser()
	 * @generated
	 */
	EReference getLoggedInUser_Comments();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.spl.LoggedInUser#getCreatedQuizzes <em>Created Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Created Quizzes</em>'.
	 * @see no.ntnu.tdt4250.spl.LoggedInUser#getCreatedQuizzes()
	 * @see #getLoggedInUser()
	 * @generated
	 */
	EReference getLoggedInUser_CreatedQuizzes();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.spl.QuizApp <em>Quiz App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz App</em>'.
	 * @see no.ntnu.tdt4250.spl.QuizApp
	 * @generated
	 */
	EClass getQuizApp();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.QuizApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.spl.QuizApp#getName()
	 * @see #getQuizApp()
	 * @generated
	 */
	EAttribute getQuizApp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.spl.QuizApp#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see no.ntnu.tdt4250.spl.QuizApp#getUser()
	 * @see #getQuizApp()
	 * @generated
	 */
	EReference getQuizApp_User();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.spl.QuizApp#getQuiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quiz</em>'.
	 * @see no.ntnu.tdt4250.spl.QuizApp#getQuiz()
	 * @see #getQuizApp()
	 * @generated
	 */
	EReference getQuizApp_Quiz();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.spl.QuizApp#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see no.ntnu.tdt4250.spl.QuizApp#getComment()
	 * @see #getQuizApp()
	 * @generated
	 */
	EReference getQuizApp_Comment();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.spl.QuizApp#getTotalQuizzes <em>Total Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quizzes</em>'.
	 * @see no.ntnu.tdt4250.spl.QuizApp#getTotalQuizzes()
	 * @see #getQuizApp()
	 * @generated
	 */
	EAttribute getQuizApp_TotalQuizzes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SplFactory getSplFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.spl.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.spl.impl.UserImpl
		 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Attempted Quizzes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ATTEMPTED_QUIZZES = eINSTANCE.getUser_AttemptedQuizzes();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.spl.impl.QuizImpl <em>Quiz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.spl.impl.QuizImpl
		 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getQuiz()
		 * @generated
		 */
		EClass QUIZ = eINSTANCE.getQuiz();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ__TITLE = eINSTANCE.getQuiz_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ__DESCRIPTION = eINSTANCE.getQuiz_Description();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ__CREATED_BY = eINSTANCE.getQuiz_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Attempted By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ__ATTEMPTED_BY = eINSTANCE.getQuiz_AttemptedBy();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ__COMMENTS = eINSTANCE.getQuiz_Comments();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ__ID = eINSTANCE.getQuiz_Id();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ__CREATED_DATE = eINSTANCE.getQuiz_CreatedDate();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.spl.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.spl.impl.CommentImpl
		 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '<em><b>Quiz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__QUIZ = eINSTANCE.getComment_Quiz();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__ID = eINSTANCE.getComment_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TIMESTAMP = eINSTANCE.getComment_Timestamp();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.spl.impl.GuestUserImpl <em>Guest User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.spl.impl.GuestUserImpl
		 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getGuestUser()
		 * @generated
		 */
		EClass GUEST_USER = eINSTANCE.getGuestUser();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.spl.impl.LoggedInUserImpl <em>Logged In User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.spl.impl.LoggedInUserImpl
		 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getLoggedInUser()
		 * @generated
		 */
		EClass LOGGED_IN_USER = eINSTANCE.getLoggedInUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGED_IN_USER__USERNAME = eINSTANCE.getLoggedInUser_Username();

		/**
		 * The meta object literal for the '<em><b>Profile Picture URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGED_IN_USER__PROFILE_PICTURE_URL = eINSTANCE.getLoggedInUser_ProfilePictureURL();

		/**
		 * The meta object literal for the '<em><b>Streak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGED_IN_USER__STREAK = eINSTANCE.getLoggedInUser_Streak();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGGED_IN_USER__COMMENTS = eINSTANCE.getLoggedInUser_Comments();

		/**
		 * The meta object literal for the '<em><b>Created Quizzes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGGED_IN_USER__CREATED_QUIZZES = eINSTANCE.getLoggedInUser_CreatedQuizzes();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.spl.impl.QuizAppImpl <em>Quiz App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.spl.impl.QuizAppImpl
		 * @see no.ntnu.tdt4250.spl.impl.SplPackageImpl#getQuizApp()
		 * @generated
		 */
		EClass QUIZ_APP = eINSTANCE.getQuizApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_APP__NAME = eINSTANCE.getQuizApp_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_APP__USER = eINSTANCE.getQuizApp_User();

		/**
		 * The meta object literal for the '<em><b>Quiz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_APP__QUIZ = eINSTANCE.getQuizApp_Quiz();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_APP__COMMENT = eINSTANCE.getQuizApp_Comment();

		/**
		 * The meta object literal for the '<em><b>Total Quizzes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_APP__TOTAL_QUIZZES = eINSTANCE.getQuizApp_TotalQuizzes();

	}

} //SplPackage
