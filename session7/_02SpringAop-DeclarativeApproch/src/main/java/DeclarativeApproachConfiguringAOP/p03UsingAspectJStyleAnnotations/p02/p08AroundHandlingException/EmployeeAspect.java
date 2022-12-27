package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p08AroundHandlingException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class EmployeeAspect {
    private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);
    StopWatch myWatch = new StopWatch("myWatch");

    @Around("execution(public * add*(..))")
    public Object addEmployeeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        Object result=null;
        try {
            result=joinPoint.proceed();
            ///............
        }catch (Exception e)
        {
            logger.warn("we have a problem :"+ e);
            result="move along!";
        }
        return result;
    }





   }
