package p03DI.p01constructorbased.p02annotation;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session3\\session3\\src\\main\\java\\p03DI\\p01constructorbased\\p02annotation\\config.xml");
        context.refresh();

        MyService myService = context.getBean(MyService.class);
        myService.getRepository().create();

    }
}
