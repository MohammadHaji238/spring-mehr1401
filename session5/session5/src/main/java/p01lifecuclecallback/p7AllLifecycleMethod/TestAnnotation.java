package p01lifecuclecallback.p7AllLifecycleMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final Human bean = context.getBean("getHumanOne", Human.class);
        System.out.println(bean);

        //context.close();
        //or
        context.registerShutdownHook();
    }
}
