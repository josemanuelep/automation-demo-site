package co.com.choucair.certification.demosite.tasks;

import co.com.choucair.certification.demosite.interactions.SelectList;
import co.com.choucair.certification.demosite.interactions.UploadFile;
import co.com.choucair.certification.demosite.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.demosite.userinterface.SigninPage.*;
import static co.com.choucair.certification.demosite.userinterface.WebTable.BUTTON_WEB_TABLE;
import static co.com.choucair.certification.demosite.util.Constants.INDEX_0;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoWebtable implements Task {

    public static GoWebtable toDelete() {
        return Tasks.instrumented(GoWebtable.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
              Click.on(BUTTON_WEB_TABLE)
        );
    }
}
