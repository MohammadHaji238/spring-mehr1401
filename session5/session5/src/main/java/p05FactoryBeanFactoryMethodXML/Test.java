package p05FactoryBeanFactoryMethodXML;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p05FactoryBeanFactoryMethodXML\\config.xml");
        context.refresh();

        final C02MessageDigester bean = context.getBean(C02MessageDigester.class);
        bean.digest("Hello World");
        context.close();
    }
}
