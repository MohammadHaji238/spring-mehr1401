package p03DI.p01constructorbased.p03classconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    /*@Autowired
    private Repository repository2;*/
    @Bean("service")
    public MyService myService(@Qualifier("mysql") Repository repository)
    {
        return  new MyService(repository);
    }
    @Bean("mysql")
    public Repository repository1()
    {
        return new MySqlRepository();
    }
    @Bean("oracle")
    public Repository repository2()
    {
        return new OracleRepository();
    }
}
