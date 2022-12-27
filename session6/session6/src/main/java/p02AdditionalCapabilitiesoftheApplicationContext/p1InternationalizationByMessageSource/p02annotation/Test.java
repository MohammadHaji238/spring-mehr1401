package p02AdditionalCapabilitiesoftheApplicationContext.p1InternationalizationByMessageSource.p02annotation;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        MessageSource resources = new AnnotationConfigApplicationContext(Config.class);
        String message = resources.getMessage("message", null, "Default", new Locale("fa"));
    //    String message = resources.getMessage("message", null, "Default", new Locale("fr"));
        System.out.println(message);
    }
}
