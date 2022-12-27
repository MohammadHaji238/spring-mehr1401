package p06SpringBeanDefinitionInheritance.usingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"p06SpringBeanDefinitionInheritance.usingAnnotation"})
public class Config {

    @Bean
    public Cat cat()
    {
        Cat cat=new Cat();
        initAnimal(cat);
        cat.setLocation("tehran");
        return  cat;

    }
    private void initAnimal(Animal animal)
    {
        animal.setName("pashmalo");
        animal.setAge(3);
    }

}
