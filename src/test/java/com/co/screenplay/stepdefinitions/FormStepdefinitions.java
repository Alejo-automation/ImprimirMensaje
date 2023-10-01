package com.co.screenplay.stepdefinitions;

import com.co.screenplay.tasks.Form;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FormStepdefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Alejandro");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^He user is on the page$")
    public void heUserIsOnThePage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/automation-practice-form"));
        Thread.sleep(1500);
    }

    @When("^He user into to information form$")
    public void heUserIntoToInformationForm() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(Form.enter());
        Thread.sleep(2500);
    }

    @Then("^He user send information about form$")
    public void heUserSendInformationAboutForm() {
    }
}
