package p04FactoryBean.p03class;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public C01MessageDigestFactoryBean defaultDigest()
    {
        return new C01MessageDigestFactoryBean();
    }
    @Bean
    public C01MessageDigestFactoryBean shaDigest()
    {
        C01MessageDigestFactoryBean factoryOne=new C01MessageDigestFactoryBean();
        factoryOne.setAlgorithmName("SHA1");
        return factoryOne;
    }
    @Bean
    public C02MessageDigester digester() throws Exception {
        C02MessageDigester digester=new C02MessageDigester();
        digester.setDigest1(shaDigest().getObject());
        digester.setDigest2(defaultDigest().getObject());
        return digester;
    }
}
