package p02BeanScopes.p03LazyOnlyForSingleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

      //  Bean bean = context.getBean(Bean.class);
    }
}
