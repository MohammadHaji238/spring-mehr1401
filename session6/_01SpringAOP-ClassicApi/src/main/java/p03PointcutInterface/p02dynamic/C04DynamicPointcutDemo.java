package p03PointcutInterface.p02dynamic;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class C04DynamicPointcutDemo {
    public static void main(String[] args) {
        C01MyBean target=new C01MyBean();

        Advisor advisor=new DefaultPointcutAdvisor(new C02SimpleDynamicPointcut(),new C03SimpleAdvice());
        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(target);

       C01MyBean proxy=(C01MyBean) pf.getProxy();
       proxy.m1(101);
     //  proxy.m1(200);
     //  proxy.m1(303);

      // proxy.m2();
      // proxy.m2();
      // proxy.m2();
    }
}
