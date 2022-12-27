package p07mixconfig.p02class;

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
