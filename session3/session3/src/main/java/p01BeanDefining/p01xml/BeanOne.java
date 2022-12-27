package p01BeanDefining.p01xml;

import org.springframework.stereotype.Component;


public class BeanOne {
    private String name;

    public BeanOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
