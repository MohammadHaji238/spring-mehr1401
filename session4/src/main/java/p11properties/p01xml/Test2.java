package p11properties.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class Test2 {
    public static void main(String[] args) throws SQLException {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p11properties\\config2.xml");
        context.refresh();


        final InjectProperty injectProperty = context.getBean(InjectProperty.class);
        final String property = injectProperty.getProperties().getProperty("jdbc.url");
        System.out.println(property);


    }
}
