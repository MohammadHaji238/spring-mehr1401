package p04FactoryBean.p03class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {
    public static void main(String[] args) throws Exception {
        var context=new AnnotationConfigApplicationContext(Config.class);
         C02MessageDigester digester = context.getBean("digester", C02MessageDigester.class);
        digester.digest("hello world");
        context.close();


    }
}
