package ir.digixo.p02AutomaticRegistrationOFBeanFactoryPostProcessorAndBeanPostProcessor;

import ir.digixo.beans.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class C03BeanFactoryDemo {
    //
    public static void main( String[] args )
    {
        var factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        Resource res = new ClassPathResource("p02myContext.xml");
        reader.loadBeanDefinitions(res);
//automatic registration did not happen.
        System.out.println(C01MyBeanFactoryPostProcessor.isIsBeanFactoryPostProcessorRegistered());
        System.out.println(C02MyBeanPostProcessor.isIsBeanPostProcessorRegistered());
    }
}
