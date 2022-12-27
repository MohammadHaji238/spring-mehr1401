package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class EmployeeAspect {
   // private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);

  /*  @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* ir.digixo.aop.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }
*/
   // @Before("execution( * ir.digixo.aop.EmployeeService.addEmployee(..))")
   // @Before("execution( * ir.digixo.aop.EmployeeService.addEmployee())")
    //@Before("execution( *  *e*())")
    //@Before("execution( public void  EmployeeService.*e*())")
    //@Before("execution( *  EmployeeService.*e*())")
    // @Before("execution( *  *.*.*e*())")//kar nemikone
   // @Before("execution( *  *.*e*())")//kar mikone
    //@Before("execution( *  ir..*.*e*())")
   // @Before("execution( *  *.*e*())")
   // @Before("execution( void add*())")
   /* @Before("execution(public * add*())")
    public void addEmployeeAdvice() throws Throwable {
       // System.out.println("Before Employee insert in DB");
        log.info("========>executing @Before advice on createEmployeeAdvice()");
    }*/
    @AfterReturning(value="execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices.EmployeeService.findEmployee())",returning="result")
    public void findEmployeeAdvice(Object result)
    {
        System.out.println("Horaaaa "+result);
    }
  /* @AfterThrowing(value="execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices.EmployeeService.errorrrrrr(..))",throwing = "e")
    public void khata(Exception e)
    {
        System.out.println("khata rokhdade"+e);
    }*/

    @Around("execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices.*.*(..))")
    public void deleteEmployeeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before");
        Object proceed = joinPoint.proceed();
        System.out.println("after");
    }



  /*  @Pointcut("execution( * DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices.EmployeeService.addEmployee(..))")
    public void beforePoint()
    {
    }
    @Before("beforePoint()")
    public void beforeAdvice()
    {
        System.out.println("beforeAdvice");
    }*/
}
