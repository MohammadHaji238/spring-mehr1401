package p03DI.p03circulardependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

    }
}
