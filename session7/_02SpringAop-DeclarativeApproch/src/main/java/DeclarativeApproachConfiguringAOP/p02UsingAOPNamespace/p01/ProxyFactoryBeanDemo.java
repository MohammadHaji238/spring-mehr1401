package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p01;


import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProxyFactoryBeanDemo {
    public static void main(String[] args) {


        var context=new GenericXmlApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session7\\_02SpringAop-DeclarativeApproch\\src\\main\\java\\DeclarativeApproachConfiguringAOP\\p02UsingAOPNamespace\\p01\\Config.xml");
        context.refresh();


         Office bean = context.getBean(Office.class);
        bean.execute();
    }
}
