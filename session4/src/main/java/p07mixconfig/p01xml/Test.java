package p07mixconfig.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import p05dependon.p01xml.BeanOne;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p07mixconfig\\p01xml\\config1.xml");
        context.refresh();


    }
}
