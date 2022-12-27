package p03PointcutInterface.p01static;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class StaticPointcutDemo {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer=new JavaProgrammer();
        PhpProgrammer phpProgrammer=new PhpProgrammer();

        Programmer proxyOne;
        Programmer proxyTwo;

        Pointcut pc=new SimpleStaticPointcut();
        Advice advice=new SimpleAdvice();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);

        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(phpProgrammer);
        proxyOne= (Programmer) pf.getProxy();


        pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(javaProgrammer);
        proxyTwo= (Programmer) pf.getProxy();



        proxyOne.code();
        proxyTwo.code();

    }
}
