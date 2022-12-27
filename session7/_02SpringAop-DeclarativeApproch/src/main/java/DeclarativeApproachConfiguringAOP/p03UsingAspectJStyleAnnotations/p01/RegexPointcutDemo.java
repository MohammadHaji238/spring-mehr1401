package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegexPointcutDemo {
    public static void main(String[] args) {
       /* JavaProgrammer javaProgrammer=new JavaProgrammer();


       // Pointcut pc=new SimpleStaticPointcut();
        JdkRegexpMethodPointcut pc=new JdkRegexpMethodPointcut();
        pc.setPattern(".*code.*");
        Advice advice=new ProgrammerMonitorAspect();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);

        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(javaProgrammer);
        JavaProgrammer proxy= (JavaProgrammer) pf.getProxy();
          proxy.code();
      proxy.code2();
      proxy.rest();
*/
        var context = new AnnotationConfigApplicationContext(AopConfig.class);
        JavaProgrammer javaProgrammer = (JavaProgrammer) context.getBean("hassan");
        Office office = (Office) context.getBean("office");
        //javaProgrammer.code();
        office.execute();


    }
}
