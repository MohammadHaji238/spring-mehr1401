package p01lifecuclecallback.p06BeanNameAware;

import org.springframework.beans.factory.BeanNameAware;

public class Player implements BeanNameAware {

    private String name;


    @Override
    public void setBeanName(String name) {
        this.name=name;
    }

    void play()
    {
        System.out.println("player "+name+ "is playing");
    }
}
