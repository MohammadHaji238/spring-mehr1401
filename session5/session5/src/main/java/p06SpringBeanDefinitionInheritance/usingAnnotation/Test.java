package p06SpringBeanDefinitionInheritance.usingAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final Cat bean = context.getBean(Cat.class);
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
        System.out.println(bean.getLocation());

    }
}
