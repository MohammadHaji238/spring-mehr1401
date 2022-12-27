package p02abstraction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final MyService bean = context.getBean(MyService.class);
        bean.getRepository().create();

    }
}
