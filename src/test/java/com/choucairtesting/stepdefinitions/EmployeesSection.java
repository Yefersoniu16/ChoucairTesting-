package com.choucairtesting.stepdefinitions;

import com.choucairtesting.interactions.questions.VerifyFieldJobs;
import com.choucairtesting.interactions.questions.VerifyInformation;
import com.choucairtesting.interactions.tasks.EnterEmployment;
import com.choucairtesting.interactions.tasks.FieldJobs;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmployeesSection {

    @Before
    public void setThestago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("yeferson");
    }

    @Given("^Into in the page choucair testing$")
    public void intoInThePageChoucairTesting() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));
    }


    @When("^Page functionality$")
    public void pageFunctionality() {
        theActorInTheSpotlight().attemptsTo(EnterEmployment.enterEmployment());

    }

    @Then("^Field Verification$")
    public void fieldVerification() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformation.verifyinformation()));
    }
    @When("^Go to employment page$")
    public void goToEmploymentPage() {
        theActorInTheSpotlight().attemptsTo(FieldJobs.fieldJobs());
    }

    @Then("^View jobs$")
    public void viewJobs() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyFieldJobs.verifyfieldjobs()));

    }

}
