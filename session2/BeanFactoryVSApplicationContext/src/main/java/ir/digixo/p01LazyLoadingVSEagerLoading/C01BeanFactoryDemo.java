package ir.digixo.p01LazyLoadingVSEagerLoading;

import ir.digixo.beans.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class C01BeanFactoryDemo {
    public static void main( String[] args )
    {

        var factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        Resource res = new ClassPathResource("p01myContext.xml");
        reader.loadBeanDefinitions(res);
        System.out.println(Product.isIsBeanInstantiated());

        //step2
        Product product1 = factory.getBean("product1", Product.class);
        System.out.println(Product.isIsBeanInstantiated());
    }
}
