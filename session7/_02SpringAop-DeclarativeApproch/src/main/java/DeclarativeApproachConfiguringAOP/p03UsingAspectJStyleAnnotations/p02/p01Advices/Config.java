package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices"})
public class Config {
}
