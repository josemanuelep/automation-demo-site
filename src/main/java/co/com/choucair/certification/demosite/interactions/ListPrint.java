package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


public class ListPrint implements Interaction {

    public static ListPrint theElements(){
        return new ListPrint();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
//        List<WebElementFacade> list = BUTTON_NAME_OF_TV.resolveAllFor(actor);
//        for (WebElementFacade element :list) {
//            CustomLogger.printMessage(element.getText());
//        }
    }
}
