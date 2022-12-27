package p09customizingScanning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"p09customizingScanning"},
       // includeFilters =@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = MyAnnotation.class) )
        //includeFilters =@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MyInterface.class) )
       // includeFilters =@ComponentScan.Filter(type = FilterType.REGEX,pattern = ".*[ean]") )
        includeFilters =@ComponentScan.Filter(type = FilterType.ASPECTJ,pattern = "p09customizingScanning.*"),
excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION))
public class Config {
}
