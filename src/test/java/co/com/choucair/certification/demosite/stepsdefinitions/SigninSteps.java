package co.com.choucair.certification.demosite.stepsdefinitions;


import co.com.choucair.certification.demosite.model.User;
import co.com.choucair.certification.demosite.tasks.OpenThe;
import co.com.choucair.certification.demosite.tasks.Register;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SigninSteps {
    private String actorName = "Jose";

    @Given("^Jose wants log on Automation Demo$")
    public void joseWantsLogOnAutomationDemo() {
        theActorCalled(actorName).wasAbleTo(OpenThe.page());

    }

    @When("^Jose register in the page$")
    public void joseRegisterInThePage(List<User> users) {
        theActorCalled(actorName).wasAbleTo(Register.inTheForm(users));
    }

    @Then("^He should see \"([^\"]*)\"$")
    public void heShouldSee(String arg1) {

    }

}
