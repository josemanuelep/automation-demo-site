package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;



import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ClickOn implements Interaction {
    private JavascriptExecutor js = (JavascriptExecutor) getDriver();
    private Target tg;

    public ClickOn(Target tg) {
        this.tg = tg;
    }

    public static ClickOn element(Target tg){
        return new ClickOn(tg);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        js.executeScript("window.scrollTo(0,"+tg.resolveFor(actor).getLocation().y+")");
    }
}
