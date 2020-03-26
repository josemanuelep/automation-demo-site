package co.com.choucair.certification.demosite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UploadFile implements Interaction {

    private static final Logger LOGGER = Logger.getLogger(UploadFile.class.getName());

    private Target obj;

    public UploadFile(Target obj) {
        this.obj = obj;
    }

    public static UploadFile of(Target obj) {
        return new UploadFile(obj);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            File fileRelative = new File(".\\src\\main\\resources\\testFiles\\photo.png");
            Path path = Paths.get(fileRelative.getCanonicalPath());
            actor.attemptsTo(Upload.theFile(path).to(obj));
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Element not found in class UpLoadFile");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "It is not possible select UpLoadFile", e);
        }
    }
}