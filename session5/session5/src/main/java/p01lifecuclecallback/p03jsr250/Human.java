package p01lifecuclecallback.p03jsr250;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Human {


    public Human() {
        System.out.println("humen created");
    }



    @PreDestroy
    public void myDestroy() throws Exception {

        System.out.println("destroy method of my bean called");
    }

    @PostConstruct
    public void myInit() throws Exception {
        System.out.println("afterPropertiesSet method of my bean called");
    }
}
