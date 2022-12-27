package p01BeanDefining.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session3\\session3\\src\\main\\java\\p01BeanDefining\\config.xml");
        context.refresh();

        final BeanOne beanOne = context.getBean("beanOne", BeanOne.class);
        System.out.println(beanOne.getName());
    }
}
