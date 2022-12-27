package p05dependon.p02annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanOne {
    public BeanOne() {
        System.out.println("bean one created");
    }
}
