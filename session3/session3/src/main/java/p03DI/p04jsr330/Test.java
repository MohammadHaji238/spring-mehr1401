package p03DI.p04jsr330;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
       MyService myService = context.getBean(MyService.class);
        myService.getRepository().create();
    }
}
