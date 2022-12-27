package p04CreatePointCutWithJDKRegx.p03AspecjPointCutExpression;


import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class RegexPointcutDemo {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer=new JavaProgrammer();


       // Pointcut pc=new SimpleStaticPointcut();
        AspectJExpressionPointcut pc=new AspectJExpressionPointcut();
       // pc.setPattern(".*code.*");
        pc.setExpression("execution(* code*(..))");

        Advice advice=new SimpleAdvice();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);

        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(javaProgrammer);
        JavaProgrammer proxy= (JavaProgrammer) pf.getProxy();






      proxy.code();
      proxy.code2();
      proxy.rest();

    }
}
