package co.com.choucair.certification.demosite.tasks;

import co.com.choucair.certification.demosite.interactions.SelectList;
import co.com.choucair.certification.demosite.interactions.SelectThe;
import co.com.choucair.certification.demosite.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.demosite.userinterface.SigninPage.*;
import static co.com.choucair.certification.demosite.util.Constants.INDEX_0;

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
        actor.attemptsTo(Enter.theValue(users.get(INDEX_0).getFname()).into(INPUT_FIRST_NAME),
                Enter.theValue(users.get(INDEX_0).getLname()).into(INPUT_LAST_NAME),
                Enter.theValue(users.get(INDEX_0).getAddress()).into(INPUT_ADDRESS),
                Enter.theValue(users.get(INDEX_0).getEmail()).into(INPUT_EMAIL),
                Enter.theValue(users.get(INDEX_0).getPhone()).into(INPUT_PHONE),
                SelectThe.option(users.get(INDEX_0).getGender(),INPUT_GENDERS),
                Click.on(INPUT_HOBBIES_1),
                Click.on(LANGUAGES_MULTI_SELECT),
                SelectFromOptions.byVisibleText(users.get(INDEX_0).getLanguajes()).from(LANGUAGES_LIST),
//                SelectList.theOption(users.get(INDEX_0).getLanguajes(),LANGUAGES_LIST)
                SelectFromOptions.byVisibleText(users.get(INDEX_0).getSkills()).from(SELECT_SKILLS),
                SelectFromOptions.byVisibleText(users.get(INDEX_0).getCountry()).from(SELECT_COUNTRY)
                git co

        );
    }
}
