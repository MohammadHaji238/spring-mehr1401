package p02advices.p03aroundAdvice;

import org.springframework.aop.framework.ProxyFactory;

public class C03Demo {
    public static void main(String[] args) {

        C01TargetClass target = new C01TargetClass();
        // direct call on target class instance without proxy
        target.print();
        // create an instance of ProxyFactory
        ProxyFactory pf = new ProxyFactory();
        // Add MethodInterceptor as advice
        pf.addAdvice(new C02AdviceInterceptor());
        // set the target class you want to proxy
        pf.setTarget(target);
        // Get the proxy
        C01TargetClass proxy = (C01TargetClass) pf.getProxy();
        // Call target class print function via proxy
        proxy.print();
    }
}
