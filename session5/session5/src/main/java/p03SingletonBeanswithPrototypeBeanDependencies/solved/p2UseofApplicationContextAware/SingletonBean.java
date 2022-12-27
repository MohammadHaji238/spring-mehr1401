package p03SingletonBeanswithPrototypeBeanDependencies.solved.p2UseofApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletonBean implements ApplicationContextAware {
    private PrototypeBean prototypeBean;
    private ApplicationContext applicationContext;
    public SingletonBean()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }
    public PrototypeBean getPrototypeBean()
    {
        prototypeBean= (PrototypeBean)applicationContext.getBean("prototypeBean");
        return prototypeBean;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
