package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p06After;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p06After"})
public class Config {
}
