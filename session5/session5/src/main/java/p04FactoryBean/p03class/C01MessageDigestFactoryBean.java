package p04FactoryBean.p03class;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class C01MessageDigestFactoryBean implements
        FactoryBean<MessageDigest>
        , InitializingBean {

    private String algorithmName = "MD5";
    private MessageDigest messageDigest = null;

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public C01MessageDigestFactoryBean() {
    }

    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Class<MessageDigest> getObjectType() {
        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        messageDigest = MessageDigest.getInstance(algorithmName);
    }
}
