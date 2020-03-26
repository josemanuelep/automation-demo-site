package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;


public class SelectThe implements Interaction {
    private String value;
    private Target option;

    public SelectThe(String value, Target option) {
        this.value = value;
        this.option = option;
    }

    public static SelectThe option(String value, Target option) {
        return new SelectThe(value, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> options = this.option.resolveAllFor(actor);
        for (WebElementFacade elemt : options) {
            if (elemt.getValue()==this.value)
                Click.on(elemt);
        }
    }
}
