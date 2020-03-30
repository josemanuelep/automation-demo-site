package co.com.choucair.certification.demosite.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class WebTable {
    public static final Target BUTTON_WEB_TABLE = Target.the("").located(By.xpath("//a[contains(text(),'WebTable')]"));
    public static final Target BUTTON_DELETE_DEFINITELY = Target.the("").located(By.xpath("//div[@class='ui-grid-canvas']//div[1]//div[1]//div[6]//user-click-select[1]//div[1]//div[1]//ul[1]//li[1]//button[1]"));
    public static final String BUTTON_DELETE_RECORD = "//div[@class='ui-grid-canvas']//div[1]//div[1]//div[6]//user-click-select[1]//div[1]//del-click[1]//button[1]";
}
