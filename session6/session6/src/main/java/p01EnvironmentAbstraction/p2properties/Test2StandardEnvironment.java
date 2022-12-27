package p01EnvironmentAbstraction.p2properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2StandardEnvironment {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config1.class);
        final MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean.getName());
    }
}
