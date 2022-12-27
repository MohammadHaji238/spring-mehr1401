package p02AdditionalCapabilitiesoftheApplicationContext.p2StandardEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

//https://data-flair.training/blogs/spring-event-handling/
//https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/event/package-summary.html
@Component
public class MyListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent trigerd");
        //log
    }
}
