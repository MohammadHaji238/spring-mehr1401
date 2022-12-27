package p03DI.p02setterbased.p03classconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final MyService myService = context.getBean(MyService.class);
        myService.getRepository().create();
    }
}
