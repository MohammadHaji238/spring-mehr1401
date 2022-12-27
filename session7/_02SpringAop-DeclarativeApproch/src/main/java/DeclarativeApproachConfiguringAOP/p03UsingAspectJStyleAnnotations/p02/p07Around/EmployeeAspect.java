package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p07Around;

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

    @Around("execution(public * add*())")
    public Object addEmployeeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
       //print out method we are advising on
        String method = joinPoint.getSignature().toShortString();
        //get begin timestamp
        logger.info("========>executing before around advice on "+method);
        myWatch.start();
        final Object result = joinPoint.proceed();//calling pointcut
        logger.info("in aspect :" +result);
        myWatch.stop();
        logger.info("========>executing After around  advice on "+method+" with time:"+myWatch.getTotalTimeMillis()/1000);
        return  result;
    }





   }
