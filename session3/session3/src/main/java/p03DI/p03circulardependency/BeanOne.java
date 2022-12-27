package p03DI.p03circulardependency;

import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    BeanTwo beanTwo;

    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
}
