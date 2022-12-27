package p02BeanScopes.p01singleton.p02annotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.inject.Singleton;

@Component
//@Singleton
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MysqlProductDao {
}
