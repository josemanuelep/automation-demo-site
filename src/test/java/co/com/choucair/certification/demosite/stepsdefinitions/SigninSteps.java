package co.com.choucair.certification.demosite.stepsdefinitions;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SigninSteps {
    private String actorName = "Jose";
    @Given("^Jose wants log on Automation Demo$")
    public void joseWantsLogOnAutomationDemo() {

    }

    @When("^Jose register in the page$")
    public void joseRegisterInThePage(DataTable arg1){

    }

    @Then("^He should see \"([^\"]*)\"$")
    public void heShouldSee(String arg1) {

    }

}
