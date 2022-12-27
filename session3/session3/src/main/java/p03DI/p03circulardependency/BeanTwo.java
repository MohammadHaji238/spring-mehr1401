package p03DI.p03circulardependency;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
    BeanOne beanOne;

    public BeanTwo(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
