package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        List<WebElement> options =this.option.resolveFor(actor).findElements(By.tagName("input"));
        for (WebElement elemt : options) {
            if (elemt.getAttribute("value").equals(this.value))
                elemt.click();
        }
    }
}
