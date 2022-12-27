package p01BeanDefining.p04programmatically;

import org.springframework.stereotype.Component;


public class MyService {
    public MyService() {
        System.out.println("service created");
    }

    public MyRepository repository;
}
