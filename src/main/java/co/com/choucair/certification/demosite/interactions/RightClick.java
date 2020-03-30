package co.com.choucair.certification.demosite.interactions;

import co.com.choucair.certification.demosite.util.Driver;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RightClick implements Interaction {
    private Actions actions = new Actions(getDriver());
    private WebElement elementLocator;

    public RightClick(String selector) {
        elementLocator =  getDriver().findElement(By.xpath(selector));
    }
    public static RightClick on(String selector){
        return new RightClick(selector);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actions.contextClick(elementLocator).perform();
    }
}
