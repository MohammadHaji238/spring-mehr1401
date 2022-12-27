package p04CreatePointCutWithJDKRegx.p02JDKRegex;


import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

public class RegexPointcutDemo {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer=new JavaProgrammer();


       // Pointcut pc=new SimpleStaticPointcut();
        JdkRegexpMethodPointcut pc=new JdkRegexpMethodPointcut();
       // pc.setPattern(".*code.*");
        pc.setPattern(".*code*");
        Advice advice=new SimpleAdvice();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);

        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(javaProgrammer);
        JavaProgrammer proxy= (JavaProgrammer) pf.getProxy();


      proxy.code();
      proxy.code2();
      //proxy.rest();

    }
}
