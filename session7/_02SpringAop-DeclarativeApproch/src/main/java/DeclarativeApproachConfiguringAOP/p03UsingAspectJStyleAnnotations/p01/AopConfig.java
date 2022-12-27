package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01"})
@EnableAspectJAutoProxy
public class AopConfig {
}
