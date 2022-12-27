package p07EnvironmentAbstraction.p2properties;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

public class Test1 {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new GenericApplicationContext();
       // new XmlBeanDefinitionReader(ctx).loadBeanDefinitions(Config1.class);

        ctx.refresh();
        Environment env = ctx.getEnvironment();
        //search in  PropertySource objects
      //  boolean containsMyProperty = env.containsProperty("datasource");
        boolean containsMyProperty = env.containsProperty("jdbc.url");
        System.out.println("Does my environment contain the 'my-property' property? " +
                containsMyProperty);
    }
}
