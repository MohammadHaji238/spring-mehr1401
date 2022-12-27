package p01lifecuclecallback.p7AllLifecycleMethod;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//@Component
@Data
public class Human  implements InitializingBean, DisposableBean, BeanNameAware, BeanClassLoaderAware, ApplicationContextAware {
    private int age;
    private String name;
    public Human() {
        System.out.println("myBean created!");
    }


    @PostConstruct
    public void init()
    {
        System.out.println("init for @PostConstruct");


    }
    @PreDestroy
    public void mydestroy()
    {
        System.out.println("destroy for @PreDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init for InitializingBean interface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy for DisposableBean interface");
    }

    public void myCustomInit()
    {
        System.out.println("init for MyCustomInit Method");
    }
    public void myCustomDestroy()
    {
        System.out.println("destroy for MyCustomDestroy Method");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("spring called setBeanName after it has finished configuring your bean but before any life-cycle callbacks");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext called");
    }
}
