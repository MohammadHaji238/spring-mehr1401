package p07mixconfig.p01xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    @Bean
    public BeanTwo beanTwo()
    {
        return  new BeanTwo();
    }
}
