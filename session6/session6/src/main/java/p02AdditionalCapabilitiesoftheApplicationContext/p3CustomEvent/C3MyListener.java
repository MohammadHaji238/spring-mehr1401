package p02AdditionalCapabilitiesoftheApplicationContext.p3CustomEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;


public class C3MyListener implements ApplicationListener<C1MyEvent> {
    @Override
    @Async
    public void onApplicationEvent(C1MyEvent event) {
        //khodesh run mishe
       // System.out.println(event.toString());
        System.out.println("my listener invoked");
    }
}
