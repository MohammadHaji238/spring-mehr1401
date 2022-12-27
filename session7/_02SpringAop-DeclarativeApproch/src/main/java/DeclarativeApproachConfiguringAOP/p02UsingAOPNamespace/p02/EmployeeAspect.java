package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p02;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Slf4j
public class EmployeeAspect {
   // private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);

    //@Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }

   // @Before("execution(* ir.digixo.aop.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }

    public void beforeFindEmployeeAdvice1()
    {
        log.info("Horaaaa before");
    }
    public void afterfindByIdEmployeeAdvice2(Object result)
    {
        log.info("Horaaaa after:"+result);
    }
    public void createEmployeeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        final Object[] args = joinPoint.getArgs();
        System.out.println(args[0]+ "  insert in DB");
        final String name = joinPoint.getSignature().getName();
        joinPoint.proceed();//method execution
        System.out.println("after  joinPoint.proceed();");
    }


    public void khata(Exception e)
    {
        System.out.println("khata rokhdade"+e);
    }

    public void deleteEmployee(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before");
        joinPoint.proceed();
        System.out.println("after");
    }
}
