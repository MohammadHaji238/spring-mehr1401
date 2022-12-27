package ir.digixo.p01LazyLoadingVSEagerLoading;

import ir.digixo.beans.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C02ApplicationContextDemo {
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("p01myContext.xml");
        System.out.println(Product.isIsBeanInstantiated());


    }
}
