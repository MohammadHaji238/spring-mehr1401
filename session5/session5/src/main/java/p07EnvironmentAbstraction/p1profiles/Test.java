package p07EnvironmentAbstraction.p1profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        //var context=new AnnotationConfigApplicationContext(Config.class);
        var context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(Config.class,Config2.class);
        context.refresh();


        //
        final BeanThree bean = context.getBean(BeanThree.class);
        System.out.println(bean);

    }
}
