package no.ntnu.tdt4250.spl.tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import no.ntnu.tdt4250.spl.*;

public class QuizAppValidationTest {

	@Test
	public void testCommentAuthorMustHaveCompletedQuizConstraint() {
	    SplFactory factory = SplFactory.eINSTANCE;
	    QuizApp app = factory.createQuizApp();
	    app.setName("TestApp");

	    LoggedInUser user = factory.createLoggedInUser();
	    user.setUsername("Emil");
	    user.setId("a1b2c3");
	    app.getUser().add(user);

	    Quiz quiz = factory.createQuiz();
	    quiz.setTitle("Science Quiz");
	    quiz.setDescription("Basic science questions");
	    quiz.setCreatedBy(user);
	    quiz.setCreatedDate(new Date());
	    app.getQuiz().add(quiz);

	    Comment comment = factory.createComment();
	    comment.setAuthor(user);
	    comment.setQuiz(quiz);
	    comment.setContent("Nice quiz!");
	    comment.setTimestamp(new Date());
	    app.getComment().add(comment);

	    Diagnostic result = Diagnostician.INSTANCE.validate(app);
	    printDiagnostics(result);
	    assertEquals(Diagnostic.ERROR, result.getSeverity());

	    quiz.getAttemptedBy().add(user);

	    result = Diagnostician.INSTANCE.validate(app);
	    printDiagnostics(result);
	    assertEquals(Diagnostic.OK, result.getSeverity());
	}

	private void printDiagnostics(Diagnostic diagnostic) {
	    System.out.println("Result: " + diagnostic.getSeverity() + " - " + diagnostic.getMessage());
	    for (Diagnostic child : diagnostic.getChildren()) {
	        System.out.println(" - [" + child.getSeverity() + "] " + child.getMessage());
	        for (Diagnostic grand : child.getChildren()) {
	            System.out.println("   * " + grand.getMessage());
	        }
	    }
	}


    @Test
    public void testTotalQuizzesDerivedFeature() {
        SplFactory factory = SplFactory.eINSTANCE;
        QuizApp app = factory.createQuizApp();

        Quiz q1 = factory.createQuiz();
        Quiz q2 = factory.createQuiz();

        app.getQuiz().add(q1);
        app.getQuiz().add(q2);

        assertEquals(2, app.getTotalQuizzes());
    }
}
