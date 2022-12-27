package p01lifecuclecallback.p05applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ShutDownHookBean implements ApplicationContextAware {

    ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
        if (applicationContext instanceof GenericApplicationContext)
            ((GenericApplicationContext) applicationContext).registerShutdownHook();
    }


}
