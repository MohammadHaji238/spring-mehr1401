package ir.digixo.p02AutomaticRegistrationOFBeanFactoryPostProcessorAndBeanPostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class C02MyBeanPostProcessor implements BeanPostProcessor {

    private static boolean isBeanPostProcessorRegistered = false;

    public static boolean isIsBeanPostProcessorRegistered() {
        return isBeanPostProcessorRegistered;
    }

    public static void setIsBeanPostProcessorRegistered(boolean isBeanPostProcessorRegistered) {
        C02MyBeanPostProcessor.isBeanPostProcessorRegistered = isBeanPostProcessorRegistered;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName){
        setIsBeanPostProcessorRegistered(true);
        return bean;
    }


}
