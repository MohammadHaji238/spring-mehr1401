package p01BeanDefining.p02Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {
    @Autowired
    public MyRepository repository;
}
