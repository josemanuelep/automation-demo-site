package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectList implements Interaction {
    private String option;
    private Target list;

    public SelectList(String option, Target list) {
        this.option = option;
        this.list = list;
    }

    public static SelectList theOption(String option, Target list) {
        return new SelectList(option, list);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> options = this.list.resolveFor(actor).findElements(By.tagName("li"));
        for (WebElement elemt : options) {
            if (elemt.getText().equals(this.option)) {
                elemt.findElement(By.tagName("a")).click();
            }
        }
    }
}
