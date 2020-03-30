package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HandleAlert implements Interaction {

    public static HandleAlert accept() {
        return new HandleAlert();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getDriver();
        try {
            Thread.sleep(5000);
//            WebDriverWait wait = new WebDriverWait(driver, 2);
//            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.wait(100);
            alert.accept();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
