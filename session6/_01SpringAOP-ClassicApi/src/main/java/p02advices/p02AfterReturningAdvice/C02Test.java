package p02advices.p02AfterReturningAdvice;

import org.springframework.aop.framework.ProxyFactory;

public class C02Test {
    public static void main(String[] args) {
        Human target=new Human();
        ProxyFactory pf=new ProxyFactory();
        C01SimpleAfterReturningAdvice advice=new C01SimpleAfterReturningAdvice();
        pf.addAdvice(advice);
        pf.setTarget(target);

        Human proxy= (Human) pf.getProxy();
        proxy.study();
    }
}
