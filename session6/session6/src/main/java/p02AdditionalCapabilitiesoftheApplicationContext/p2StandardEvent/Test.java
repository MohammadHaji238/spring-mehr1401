package p02AdditionalCapabilitiesoftheApplicationContext.p2StandardEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        context.start();

    }
}
