package co.com.choucair.certification.demosite.tasks;

import co.com.choucair.certification.demosite.interactions.HandleAlert;
import co.com.choucair.certification.demosite.interactions.RightClick;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static co.com.choucair.certification.demosite.userinterface.WebTable.BUTTON_DELETE_DEFINITELY;
import static co.com.choucair.certification.demosite.userinterface.WebTable.BUTTON_DELETE_RECORD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class DeleteRecord implements Task {

    private int quantity;

    public DeleteRecord(int quantity) {
        this.quantity = quantity;
    }

    public static DeleteRecord ofTable(int quantity) {
        return Tasks.instrumented(DeleteRecord.class, quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < this.quantity ; i++) {
            actor.attemptsTo(
                    RightClick.on(BUTTON_DELETE_RECORD),
                    Click.on(BUTTON_DELETE_DEFINITELY),
                    Hit.the(Keys.ENTER).into(BUTTON_DELETE_DEFINITELY)
//                    HandleAlert.accept()
            );
        }

    }
}
