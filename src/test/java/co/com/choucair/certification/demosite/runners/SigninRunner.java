package co.com.choucair.certification.demosite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/signin.feature",
        tags = "@regresion",
        glue = {"co.com.choucair.certification.demosite.stepsdefinitions", "co.com.choucair.certification.demosite.util"},
        snippets = SnippetType.CAMELCASE)
public class SigninRunner {

}
