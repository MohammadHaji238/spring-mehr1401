package p01lifecuclecallback.p7AllLifecycleMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"p01lifecuclecallback.p7AllLifecycleMethod"})
public class Config {
    @Lazy
    @Bean(initMethod = "myCustomInit",destroyMethod = "myCustomDestroy")
    public Human getHumanOne()
    {
        Human human=new Human();
        human.setAge(12);
        human.setName("ali");
        return human;
    }
}
