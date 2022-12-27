package p01lifecuclecallback.p04classbased;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Human {


    public Human() {
        System.out.println("humen created");
    }




    public void myDestroy() throws Exception {

        System.out.println("destroy method of my bean called");
    }


    public void myInit() throws Exception {
        System.out.println("afterPropertiesSet method of my bean called");
    }
}
