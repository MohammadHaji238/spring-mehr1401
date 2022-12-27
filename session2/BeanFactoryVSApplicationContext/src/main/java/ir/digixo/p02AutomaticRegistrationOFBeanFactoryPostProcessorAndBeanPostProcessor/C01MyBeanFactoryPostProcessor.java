package ir.digixo.p02AutomaticRegistrationOFBeanFactoryPostProcessorAndBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class C01MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {

    private static boolean isBeanFactoryPostProcessorRegistered = false;

    public static boolean isIsBeanFactoryPostProcessorRegistered() {
        return isBeanFactoryPostProcessorRegistered;
    }

    public static void setIsBeanFactoryPostProcessorRegistered(boolean isBeanFactoryPostProcessorRegistered) {
        C01MyBeanFactoryPostProcessor.isBeanFactoryPostProcessorRegistered = isBeanFactoryPostProcessorRegistered;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        setIsBeanFactoryPostProcessorRegistered(true);
    }
}
