package com.anisa;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class SpringMvcDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDataJpaApplication.class, args);
    }


    @Bean
    public Config config()
    {
        return  new Config()
                .setInstanceName("hazelcast-instance")
                .addMapConfig(new MapConfig().setName("product-cache").setTimeToLiveSeconds(30000));

    }

}
