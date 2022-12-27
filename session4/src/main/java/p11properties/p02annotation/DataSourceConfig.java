package p11properties.p02annotation;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"p11properties.p02annotation"})
@PropertySource("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p11properties\\p01xml\\datasource\\datasource.properties")
public class DataSourceConfig {

   // @Value("com.mysql.cj.jdbc.Driver")
    @Value("${jdbc.driver}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer()
    {
        PropertySourcesPlaceholderConfigurer configurer=new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new FileSystemResource("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p11properties\\p01xml\\datasource\\datasource.properties"));
        return configurer;
    }*/
    @Bean
    public DataSource dataSource()
    {
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }
}
