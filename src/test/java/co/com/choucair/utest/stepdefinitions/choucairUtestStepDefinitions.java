package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.modal.ChoucairUtestData;
import co.com.choucair.utest.questions.Answer;
import co.com.choucair.utest.tasks.Join;
import co.com.choucair.utest.tasks.OpenUp;
import co.com.choucair.utest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class choucairUtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Danna wants to Join Today$")
    public void thanDannaWantsToJoinToday() {
        OnStage.theActorCalled("Danna").wasAbleTo(OpenUp.thePage() , Join.OnThePage());
    }

    @When("^she fills in the required fields of the form$")
    public void sheFillsInTheRequiredFieldsOfTheForm(List<ChoucairUtestData> choucairUtestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.OnThePage(choucairUtestData.get(0).getStrFirstName(), choucairUtestData.get(0).getStrLastName(), choucairUtestData.get(0).getStrEmail(), choucairUtestData.get(0).getStrCity(),choucairUtestData.get(0).getStrPostalCode(),choucairUtestData.get(0).getStrPassword(),choucairUtestData.get(0).getStrConfirmPassword()));
    }

    @Then("^She has selected checklist$")
    public void sheHasSelectedChecklist(List<ChoucairUtestData> choucairUtestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(choucairUtestData.get(0).getStrInformation())));
    }


}
