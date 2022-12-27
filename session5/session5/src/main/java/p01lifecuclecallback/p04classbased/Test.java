package p01lifecuclecallback.p04classbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

       // context.close();
        //or
        context.registerShutdownHook();
    }
}
