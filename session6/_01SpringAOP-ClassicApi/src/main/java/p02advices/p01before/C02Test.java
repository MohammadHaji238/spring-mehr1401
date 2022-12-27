package p02advices.p01before;

import org.springframework.aop.framework.ProxyFactory;

public class C02Test {
    public static void main(String[] args) {
        Human human=new Human();
        ProxyFactory pf=new ProxyFactory();
        pf.addAdvice(new C01SimpleBeforeAdvice());
        pf.setTarget(human);

        Human proxy=(Human) pf.getProxy();
        proxy.speak();
    }
}
