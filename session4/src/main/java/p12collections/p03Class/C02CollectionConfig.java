package p12collections.p03Class;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.*;

@Configuration
public class C02CollectionConfig {
    @Bean
    public C01CollectionBean getCollectionsBean() {
       // return new C01CollectionBean();
        C01CollectionBean bean= new C01CollectionBean(new HashSet<>(Arrays.asList("John", "Adam", "Harry")));
        Map<Integer, String>  myMap = new HashMap<>();
        myMap.put(1, "aa");
        myMap.put(2, "bb");
        myMap.put(3, "cc");
        bean.setMyMap(myMap);
        return bean;
    }

    @Bean
    public List<String> myList() {
        return Arrays.asList("Ali", "reza", "Hoda");
    }

    //
    @Bean
    @Order(2)
    public C04MyBean bean1() {
        return new C04MyBean("11");
    }
    @Bean
    @Order(3)
    public C04MyBean bean2() {
        return new C04MyBean("22");
    }
    @Bean
    @Order(1)
    public C04MyBean bean3() {
        return new C04MyBean("33");
    }

}
