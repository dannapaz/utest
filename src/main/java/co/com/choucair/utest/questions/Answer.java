package co.com.choucair.utest.questions;

import co.com.choucair.utest.userinterface.ChoucairRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcome = Text.of(ChoucairRegisterPage.WELCOME).viewedBy(actor).asString();
        if (question.equals(welcome)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}