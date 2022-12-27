package p01BeanDefining.p04programmatically;

import org.springframework.stereotype.Component;


public class MyRepository {
    public MyRepository() {
        System.out.println("repo created");
    }
}
