package co.com.choucair.certification.demosite.interactions;

import co.com.choucair.certification.demosite.util.Driver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.concurrent.TimeUnit;

public class ImplicitWait implements Interaction {
    public static ImplicitWait stop(){
        return new ImplicitWait();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Driver.getWebDriverInstance().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
