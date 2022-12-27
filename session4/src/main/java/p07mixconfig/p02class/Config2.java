package p07mixconfig.p02class;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(Config3.class)
@ImportResource(value = "file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p07mixconfig\\p02class\\config1.xml")
public class Config2 {
    @Bean
    public BeanTwo beanTwo()
    {
        return  new BeanTwo();
    }
}
