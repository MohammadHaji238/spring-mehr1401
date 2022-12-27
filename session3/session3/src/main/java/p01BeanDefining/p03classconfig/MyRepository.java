package p01BeanDefining.p03classconfig;

import org.springframework.stereotype.Component;


public class MyRepository {
    public MyRepository() {
        System.out.println("repo created");
    }
}
