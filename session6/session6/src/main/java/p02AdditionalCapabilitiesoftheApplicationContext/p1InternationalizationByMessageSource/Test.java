package p02AdditionalCapabilitiesoftheApplicationContext.p1InternationalizationByMessageSource;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        MessageSource resources = new ClassPathXmlApplicationContext("config.xml");
       // String message = resources.getMessage("message", null, "Default", new Locale("fa"));
        String message = resources.getMessage("message", null, "Default", new Locale("fr"));
        System.out.println(message);
    }
}
