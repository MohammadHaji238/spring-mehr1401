package p01lifecuclecallback.p05applicationContextAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

      //  var context=new GenericXmlApplicationContext();
       // context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p01lifecuclecallback\\p05applicationContextAware\\config.xml");


        // context.close();
        //or
    //   context.registerShutdownHook();
    }
}
