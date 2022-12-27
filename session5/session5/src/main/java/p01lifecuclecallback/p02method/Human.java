package p01lifecuclecallback.p02method;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
