package co.com.choucair.certification.demosite.util;

import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;

public class Driver  {

    private static WebDriver webDriverInstance = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();

    public static WebDriver getWebDriverInstance() {
        return webDriverInstance;
    }
}
