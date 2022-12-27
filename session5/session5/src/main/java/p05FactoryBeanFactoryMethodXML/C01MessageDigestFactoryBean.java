package p05FactoryBeanFactoryMethodXML;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class C01MessageDigestFactoryBean {

    private String algorithmName = "MD5";


    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

   public MessageDigest createInstance() throws NoSuchAlgorithmException {
       return MessageDigest.getInstance(algorithmName);
   }

}