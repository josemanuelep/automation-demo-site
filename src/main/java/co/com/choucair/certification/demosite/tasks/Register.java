package co.com.choucair.certification.demosite.tasks;

import co.com.choucair.certification.demosite.interactions.SelectList;
import co.com.choucair.certification.demosite.interactions.SelectThe;
import co.com.choucair.certification.demosite.interactions.UploadFile;
import co.com.choucair.certification.demosite.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.demosite.userinterface.SigninPage.*;
import static co.com.choucair.certification.demosite.util.Constants.INDEX_0;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Register implements Task {
    private List<User> users;

    public Register(List<User> users) {
        this.users = users;
    }

    public static Register inTheForm(List<User> users) {
        return new Register(users);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(users.get(INDEX_0).getFname()).into(INPUT_FIRST_NAME),
                Enter.theValue(users.get(INDEX_0).getLname()).into(INPUT_LAST_NAME),
                Enter.theValue(users.get(INDEX_0).getAddress()).into(INPUT_ADDRESS),
                Enter.theValue(users.get(INDEX_0).getEmail()).into(INPUT_EMAIL),
                Enter.theValue(users.get(INDEX_0).getPhone()).into(INPUT_PHONE),
                Click.on(INPUT_HOBBIES_1),
                Click.on(LANGUAGES_MULTI_SELECT),
                SelectList.theOption(users.get(INDEX_0).getLanguajes(),LANGUAGES_LIST),
                Click.on(INPUT_GENDERS.resolveAllFor(actor).get(INDEX_0)),
                SelectFromOptions.byValue(users.get(INDEX_0).getSkills()).from(SELECT_SKILLS),
                SelectFromOptions.byValue(users.get(INDEX_0).getCountry()).from(SELECT_COUNTRY),
                Scroll.to(BUTTON_SUBMIT),
                SelectFromOptions.byValue(users.get(INDEX_0).getYear()).from(SELECT_YEAR),
                SelectFromOptions.byValue(users.get(INDEX_0).getMonth()).from(SELECT_MONTH),
                SelectFromOptions.byValue(users.get(INDEX_0).getDay()).from(SELECT_DAY),
                Enter.theValue(users.get(INDEX_0).getPassword()).into(INPUT_PASS),
                Enter.theValue(users.get(INDEX_0).getPassword()).into(INPUT_PASS_2),
                UploadFile.of(UPLOAD_PHOTO)
        );
    }
}
