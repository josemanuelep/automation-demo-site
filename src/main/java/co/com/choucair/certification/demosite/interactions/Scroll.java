package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Scroll implements Interaction {
    private JavascriptExecutor js = (JavascriptExecutor) getDriver();
    private String point;

    public Scroll(String name) {
        this.point = name;
    }
    public static Scroll to(String name){
        return new Scroll(name);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        js.executeScript(point);
    }
}
