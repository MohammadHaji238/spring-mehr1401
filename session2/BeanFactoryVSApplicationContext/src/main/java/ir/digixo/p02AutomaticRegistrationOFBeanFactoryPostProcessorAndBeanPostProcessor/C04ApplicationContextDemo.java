package ir.digixo.p02AutomaticRegistrationOFBeanFactoryPostProcessorAndBeanPostProcessor;

import ir.digixo.beans.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C04ApplicationContextDemo {
    public static void main( String[] args )
    {
        var context
                = new ClassPathXmlApplicationContext("classpath:p02myContext.xml");

        System.out.println(C01MyBeanFactoryPostProcessor.isIsBeanFactoryPostProcessorRegistered());
        System.out.println(C02MyBeanPostProcessor.isIsBeanPostProcessorRegistered());


    }
}
