package p12collections.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;


public class C02Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p12collections\\p01xml\\config.xml");
        context.refresh();
        final C01CollectionBean complexObject = context.getBean("complexObject", C01CollectionBean.class);
        complexObject.displayInfo();
    }
}
