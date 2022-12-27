package p02AdditionalCapabilitiesoftheApplicationContext.p3CustomEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class C2MyEventPublisher implements ApplicationEventPublisherAware {

  //  @Autowired //or implement ApplicationEventPublisherAware
    private ApplicationEventPublisher publisher;
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher=applicationEventPublisher;
    }
    public void sendsms(String message)
    {
        C1MyEvent userEvent=new C1MyEvent(this,message);
        //publisher.publishEvent(userEvent);
        //or
        applicationContext.publishEvent(userEvent);
    }


}
