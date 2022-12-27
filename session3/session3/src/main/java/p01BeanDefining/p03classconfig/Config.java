package p01BeanDefining.p03classconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
/*@ComponentScan(basePackages = {"p01BeanDefining.p03classconfig"})*/
public class Config {
    @Bean(name = {"",""})
    public MyRepository repository()
    {
        MyRepository obj=new MyRepository();
        ///
        return obj;
    }
    @Bean
    public MyService service()
    {
        return new MyService();
    }
}
