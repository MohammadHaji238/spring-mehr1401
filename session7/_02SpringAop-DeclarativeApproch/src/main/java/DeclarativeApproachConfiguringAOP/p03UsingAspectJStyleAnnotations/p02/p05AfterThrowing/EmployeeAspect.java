package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p05AfterThrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
    private static Logger logger = LoggerFactory.getLogger(EmployeeAspect.class);


    @AfterThrowing(
            pointcut = "execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p05AfterThrowing.EmployeeService.findEmployees(..))",
            throwing = "exception")
    public void afterThrowingFindEmployeeAdvice(JoinPoint joinPoint, Throwable exception) {

       // logger.info("the exception is :" + exception);
        //or

        try {
            logger.info("the exception is :" + exception);
        }catch (Exception e)
        {

        }
    }
}
