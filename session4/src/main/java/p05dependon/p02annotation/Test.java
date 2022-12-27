package p05dependon.p02annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p05dependon\\p01xml\\config.xml");
        context.refresh();

        final BeanOne bean = context.getBean(BeanOne.class);


    }
}
