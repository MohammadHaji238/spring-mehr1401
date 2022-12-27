package p12collections.p02annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"p12collections.p02annotation"})
@ImportResource({"file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p12collections\\p02annotation\\p09collectionsV2.xml"})
public class Config {
}
