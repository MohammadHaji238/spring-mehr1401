package p01lifecuclecallback.p06BeanNameAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import p01lifecuclecallback.p05applicationContextAware.Config;

public class Test {
    public static void main(String[] args) {


        var context = new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p01lifecuclecallback\\p06BeanNameAware\\config.xml");
        context.refresh();


        Player bean = context.getBean(Player.class);
        bean.play();

        // context.close();
        //or
        //   context.registerShutdownHook();
    }
}
