package p03DI.p02setterbased.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session3\\session3\\src\\main\\java\\p03DI\\p02setterbased\\p01xml\\config.xml");
        context.refresh();

        final MyService myService = context.getBean(MyService.class);
        myService.getRepository().create();
        myService.getName();

    }
}
