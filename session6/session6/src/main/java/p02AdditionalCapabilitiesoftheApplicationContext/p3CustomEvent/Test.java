package p02AdditionalCapabilitiesoftheApplicationContext.p3CustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
         C2MyEventPublisher bean = context.getBean(C2MyEventPublisher.class);
        bean.sendsms("hello custom event");

    }
}
