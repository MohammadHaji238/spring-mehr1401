package p01lifecuclecallback.p04classbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
    public Human human()
    {
        Human human=new Human();
        return human;
    }

}
