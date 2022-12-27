package p04CreatePointCutWithJDKRegx.p01nameMatching;


import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class NameMatchMethodPointcutDemo {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer=new JavaProgrammer();


       // Pointcut pc=new SimpleStaticPointcut();
        NameMatchMethodPointcut pc=new NameMatchMethodPointcut();
        pc.addMethodName("code2");
        Advice advice=new SimpleAdvice();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);

        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(javaProgrammer);
        JavaProgrammer proxy= (JavaProgrammer) pf.getProxy();


      proxy.code();
      proxy.code2();
    //  proxy.rest();

    }
}
