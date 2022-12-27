package p05dependon.p02annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan(basePackages = {"p05dependon.p02annotation"})
public class Config {
    @Bean
    @DependsOn({"",""})
    public BeanOne beanOne()
    {
        return new BeanOne();
    }
}
