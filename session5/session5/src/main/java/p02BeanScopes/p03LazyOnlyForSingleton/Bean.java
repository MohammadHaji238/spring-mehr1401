package p02BeanScopes.p03LazyOnlyForSingleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Lazy
public class Bean {

    public Bean() {
        System.out.println("bean created!");
    }
}
