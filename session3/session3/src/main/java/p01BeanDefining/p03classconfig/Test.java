package p01BeanDefining.p03classconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

    }
}
