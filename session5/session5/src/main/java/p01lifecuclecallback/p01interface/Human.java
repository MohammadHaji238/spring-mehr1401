package p01lifecuclecallback.p01interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Human implements InitializingBean, DisposableBean {


    public Human() {
        System.out.println("humen created");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroy method of my bean called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method of my bean called");
    }
}
