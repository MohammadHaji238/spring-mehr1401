package p07mixconfig.p01xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config3 {
    @Bean
    public BeanThree beanThree()
    {
        return  new BeanThree();
    }
}
