package p01BeanDefining.p03classconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class MyService {
    public MyService() {
        System.out.println("service created");
    }

    public MyRepository repository;
}
