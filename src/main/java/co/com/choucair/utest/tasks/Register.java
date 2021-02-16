package co.com.choucair.utest.tasks;

import co.com.choucair.utest.interactions.WaitInteraction;
import co.com.choucair.utest.userinterface.ChoucairRegisterPage;
import co.com.choucair.utest.util.ConstantsNumbers;
import jdk.nashorn.internal.runtime.logging.DebugLogger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Register implements Task {

    private String strWelcolme;

    public Register(String strWelcolme) {
        this.strWelcolme = strWelcolme;
    }

    public static Register the(String strWelcome) {
        return Tasks.instrumented(Register.class, strWelcome);
    }

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strCity;
    private String strPostalCode;
    private String strPassword;
    private String strConfirmPassword;

    public Register(String strFirstName, String strLastName, String strEmail, String strCity, String strPostalCode, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Register OnThePage(String strFirstName, String strLastName, String strEmail, String strCity, String strPostalCode, String strPassword, String strConfirmPassword){
        return Tasks.instrumented(Register.class,strFirstName,strLastName,strEmail,strCity,strPostalCode, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Step1:Tell us about yourself
                Enter.theValue(strFirstName).into(ChoucairRegisterPage.FIRST_NAME),
                Enter.theValue(strLastName).into(ChoucairRegisterPage.LAST_NAME),
                Enter.theValue(strEmail).into(ChoucairRegisterPage.EMAIL),
                Click.on(ChoucairRegisterPage.MONTH),
                Click.on(ChoucairRegisterPage.DAY),
                Click.on(ChoucairRegisterPage.YEAR),
                Click.on(ChoucairRegisterPage.NEXT_LOCATION),

                //Step2: Add your address
                Enter.theValue(strCity).into(ChoucairRegisterPage.CITY),
                Enter.theValue(strPostalCode).into(ChoucairRegisterPage.POSTAL_CODE),
                Click.on(ChoucairRegisterPage.COUNTRY),
                Click.on(ChoucairRegisterPage.NEXT_DEVICES),

                //Step3 : Tell us about your devices
                Click.on(ChoucairRegisterPage.COMPUTER),
                Click.on(ChoucairRegisterPage.VERSION),
                Click.on(ChoucairRegisterPage.LANGUAGE),
                Click.on(ChoucairRegisterPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(ChoucairRegisterPage.PASSWORD),
                Enter.theValue(strConfirmPassword).into(ChoucairRegisterPage.CONFIRM_PASSWORD),
                Click.on(ChoucairRegisterPage.TERMS_OF_USE),
                Click.on(ChoucairRegisterPage.PRIVACY),
                Click.on(ChoucairRegisterPage.COMPLETE_SETUP),
                WaitInteraction.waitClass(ConstantsNumbers.FIFTEEN));


    }
}
