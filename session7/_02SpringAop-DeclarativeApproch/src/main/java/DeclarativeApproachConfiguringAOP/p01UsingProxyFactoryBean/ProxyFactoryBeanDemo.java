package DeclarativeApproachConfiguringAOP.p01UsingProxyFactoryBean;


import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProxyFactoryBeanDemo {
    public static void main(String[] args) {


        var context=new GenericXmlApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("Config1ProxyFactoryBean.xml");
        context.refresh();


         Office bean = context.getBean(Office.class);
        bean.execute();
    }
}
