package com.example._01batchprocessing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {


    @ConfigurationProperties("spring.datasource")
    @Bean
    @Primary
    public DataSource dataSource1()
    {
     return    DataSourceBuilder.create().build();
    }

    @ConfigurationProperties("spring.students")
    @Bean
    public DataSource dataSource2()
    {
        return    DataSourceBuilder.create().build();
    }
}
