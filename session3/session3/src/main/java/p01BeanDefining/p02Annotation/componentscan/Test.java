package p01BeanDefining.p02Annotation.componentscan;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session3\\session3\\src\\main\\java\\p01BeanDefining\\p02Annotation\\componentscan\\config.xml");
         context.refresh();
        final MyService service1 = context.getBean("myService", MyService.class);

        System.out.println(service1);



    }
}
