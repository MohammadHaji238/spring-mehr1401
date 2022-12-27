package p07EnvironmentAbstraction.p1profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("production")
//@Profile("test")
@Profile("dev")
public class Config2 {


    @Bean
    public BeanThree beanThree()
    {
        System.out.println("in config2");
        return new BeanThree();
    }
}
