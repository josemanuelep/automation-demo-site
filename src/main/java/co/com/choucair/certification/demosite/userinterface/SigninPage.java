package co.com.choucair.certification.demosite.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SigninPage {
    public static final Target INPUT_FIRST_NAME = Target.the("").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target INPUT_LAST_NAME = Target.the("").located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target INPUT_ADDRESS = Target.the("").located(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
    public static final Target INPUT_EMAIL = Target.the("").located(By.xpath("//input[@type='email']"));
    public static final Target INPUT_TEL = Target.the("").located(By.xpath("//input[@type='tel']"));
    public static final Target INPUT_PHONE = Target.the("").located(By.xpath("//input[@type='tel']"));
    public static final Target INPUT_GENDERS = Target.the("").located(By.xpath("//input[@type='radio']"));
    public static final Target INPUT_HOBBIES_1 = Target.the("").located(By.id("checkbox1"));
    public static final Target LANGUAGES_MULTI_SELECT = Target.the("").located(By.id("msdd"));
    public static final Target LANGUAGES_LIST = Target.the("").located(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
    public static final Target SELECT_SKILLS = Target.the("").located(By.id("Skills"));
    public static final Target SELECT_COUNTRY = Target.the("").located(By.id("countries"));
    public static final Target SELECT_YEAR = Target.the("").located(By.id("yearbox"));
    public static final Target SELECT_MONTH = Target.the("").located(By.xpath("//select[@placeholder='Month']"));
    public static final Target SELECT_DAY = Target.the("").located(By.id("daybox"));
    public static final Target INPUT_PASS = Target.the("").located(By.id("firstpassword"));
    public static final Target INPUT_PASS_2 = Target.the("").located(By.id("secondpassword"));
}
