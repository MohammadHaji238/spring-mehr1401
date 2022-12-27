package p01BeanDefining.p04programmatically;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        MyService service=new MyService();

        var context=new AnnotationConfigApplicationContext(Config.class);

        context.registerBean("service1",MyService.class,() -> service);
        context.registerBean("service", MyService.class, () -> service, new BeanDefinitionCustomizer() {
            @Override
            public void customize(BeanDefinition bd) {
                bd.setPrimary(true);
            }
        });


        final MyService service1 = context.getBean( MyService.class);
        System.out.println(service1);

    }
}
