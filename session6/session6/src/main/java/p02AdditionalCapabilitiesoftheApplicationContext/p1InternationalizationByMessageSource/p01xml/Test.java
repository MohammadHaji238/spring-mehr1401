package p02AdditionalCapabilitiesoftheApplicationContext.p1InternationalizationByMessageSource.p01xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        /*MessageSource*/  ApplicationContext resources = new FileSystemXmlApplicationContext("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session6\\session6\\src\\main\\java\\p02AdditionalCapabilitiesoftheApplicationContext\\p1InternationalizationByMessageSource\\p01xml\\config.xml");
        String message = resources.getMessage("message", null, "Default", new Locale("en"));
    //    String message = resources.getMessage("message", null, "Default", new Locale("fr"));
        System.out.println(message);
    }
}
