package p06SpringBeanDefinitionInheritance.withXMLConfigurationusinAbstractAttributeinXMLConfiguration;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p06SpringBeanDefinitionInheritance\\withXMLConfigurationusinAbstractAttributeinXMLConfiguration\\config.xml");
        context.refresh();

                final Cat bean = context.getBean(Cat.class);
        System.out.println(bean.getLocation());
        System.out.println(bean.getName());


        //error
     /*   System.out.println("@@@@@@@");
        final Animal bean1 = context.getBean(Animal.class);
        System.out.println(bean1.getName());*/
    }
}
