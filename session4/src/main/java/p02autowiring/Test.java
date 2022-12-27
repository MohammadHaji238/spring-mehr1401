package p02autowiring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p02autowiring\\config.xml");
        context.refresh();

        final Target targetByName = context.getBean("targetByName", Target.class);
        System.out.println(targetByName.getBeanThree());
    }
}
