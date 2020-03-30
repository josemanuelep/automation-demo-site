package co.com.choucair.certification.demosite.stepsdefinitions;


import co.com.choucair.certification.demosite.model.User;
import co.com.choucair.certification.demosite.questions.IsSignin;
import co.com.choucair.certification.demosite.tasks.DeleteRecord;
import co.com.choucair.certification.demosite.tasks.GoWebtable;
import co.com.choucair.certification.demosite.tasks.OpenThe;
import co.com.choucair.certification.demosite.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DleteRecordsSteps {
    private String actorName = "Jose";

    @Given("^Jose wants to go to webtable$")
    public void joseWantsToGoToWebtable()  {
        theActorCalled(actorName).wasAbleTo(OpenThe.page(),GoWebtable.toDelete());
    }


    @When("^Jose deletes (\\d+) records$")
    public void joseDeletesRecords(int quantity) {
        theActorCalled(actorName).wasAbleTo(DeleteRecord.ofTable(quantity));
    }

    @Then("^He should not see the deleted record$")
    public void heShouldNotSeeTheDeletedRecord() {

    }

}
