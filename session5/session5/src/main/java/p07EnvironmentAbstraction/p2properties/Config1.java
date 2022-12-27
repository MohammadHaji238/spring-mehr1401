package p07EnvironmentAbstraction.p2properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//moadel <context:property-placeholder location="">
@PropertySource({"classpath:datasource.properties"})
public class Config1 {
    @Autowired
    Environment env;

    @Bean
    public MyBean myBean()
    {

        MyBean myBean=new MyBean();
        myBean.setName(env.getProperty("username"));
     //   System.out.println(myBean.getName());
        return myBean;
    }

    //or
  /*  @Value("${jdbc.username}")
    private String name;*/


}
