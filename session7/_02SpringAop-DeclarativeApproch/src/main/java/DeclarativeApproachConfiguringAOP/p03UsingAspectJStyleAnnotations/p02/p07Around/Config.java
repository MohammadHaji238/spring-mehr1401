package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p07Around;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p07Around"})
public class Config {
}
