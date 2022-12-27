package p03SingletonBeanswithPrototypeBeanDependencies.problem;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       // var context=new ClassPathXmlApplicationContext("kinder-school-config.xml");
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p03SingletonBeanswithPrototypeBeanDependencies\\problem\\config.xml");
        context.refresh();


        final SingletonScope bean = context.getBean(SingletonScope.class);
        System.out.println(bean);
        System.out.println(bean.getPrototypeBean());


        System.out.println("################");


        final SingletonScope bean2 = context.getBean(SingletonScope.class);
        System.out.println(bean2);
        System.out.println(bean2.getPrototypeBean());
    }
}
