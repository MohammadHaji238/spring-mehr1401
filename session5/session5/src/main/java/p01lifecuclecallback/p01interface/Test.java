package p01lifecuclecallback.p01interface;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p01lifecuclecallback\\p01interface\\config.xml");


        context.refresh();
        context.close();
    }
}
