package co.com.choucair.certification.demosite.util;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTarget {

    public static Target selectByid(String id, String targetDescription){
       return    Target.the(targetDescription).located(By.id(id));
    }

    public static Target selectByXpaht(String xpath, String targetDescription){
        return    Target.the(targetDescription).located(By.xpath(xpath));
    }


}

