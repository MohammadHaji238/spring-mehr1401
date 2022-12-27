package p09customizingScanning;

import org.springframework.stereotype.Component;

@MyAnnotation
public class MyBean implements MyInterface {
    public MyBean() {
        System.out.println("bean one created!!");
    }
}
