package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


public class Add implements Interaction {
    public static Add theItem() {
        return new Add();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                WaitUntil.the(ADD_TO_CART, isClickable()),
//                Click.on(ADD_TO_CART),
//                Click.on(BUTTON_CART)
        );
    }
}
