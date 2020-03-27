package co.com.choucair.certification.demosite.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.demosite.userinterface.SigninPage.HEADER_SIGNIN;

public class IsSignin implements Question<Boolean> {
    private String header;

    public IsSignin(String header) {
        this.header = header;
    }

    public static IsSignin inPage(String header) {
        return new IsSignin(header);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String toCompare = HEADER_SIGNIN.resolveFor(actor).getText();
        return this.header.equals(toCompare);
    }
}
