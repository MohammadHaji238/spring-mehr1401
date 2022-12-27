package p02AdditionalCapabilitiesoftheApplicationContext.p3CustomEvent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@ComponentScan(basePackages = {"p02AdditionalCapabilitiesoftheApplicationContext.p3CustomEvent"})
public class Config {
    @Bean
    public C2MyEventPublisher publisher()
    {
        return new C2MyEventPublisher();
    }
    @Bean
    public C3MyListener userListener()
    {
        return new C3MyListener();
    }


}
