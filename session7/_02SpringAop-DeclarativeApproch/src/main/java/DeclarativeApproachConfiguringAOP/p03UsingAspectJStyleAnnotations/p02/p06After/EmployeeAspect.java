package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p06After;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
    private static Logger logger = LoggerFactory.getLogger(EmployeeAspect.class);


    @After("execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p06After.EmployeeService.findEmployees(..))")
    public void afterfinallyFindEmployeeAdvice(JoinPoint joinPoint) {

        logger.info("after advice called");



    }
   /* @AfterThrowing(
            pointcut = "execution(* ir.digixo.aop.p06After.EmployeeService.findEmployees(..))",
            throwing = "exception")
    public void afterThrowingFindEmployeeAdvice(JoinPoint joinPoint, Throwable exception) {

        // logger.info("the exception is :" + exception);
        //or

        try {
          //  logger.info("the exception is :" + exception);
            logger.info("after throwing advice called");

        }catch (Exception e)
        {

        }
    }*/
}
