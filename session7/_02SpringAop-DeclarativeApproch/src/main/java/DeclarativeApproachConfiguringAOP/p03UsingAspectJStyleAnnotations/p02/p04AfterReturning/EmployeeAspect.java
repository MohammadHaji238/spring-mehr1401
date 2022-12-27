package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p04AfterReturning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Aspect
@Component
public class EmployeeAspect {
    private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);
    @AfterReturning(pointcut = "execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p04AfterReturning.EmployeeService.findEmployees(..))"
            ,returning = "results")
    public void afterReturningFindEmployeeAdvice(JoinPoint joinPoint, Collection<Employee> results)
    {

        //print which method we are advising on
        final String method = joinPoint.getSignature().toShortString();
        logger.info("====> executing AfterReturning on "+method);
        //print the result of the method
        logger.info("===> result is : "+results);
    }

    //Post_processing
    @AfterReturning(pointcut = "execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p04AfterReturning.EmployeeService.findEmployees(..))"
            ,returning = "results")
    public void convertEmployeeNameToUpperCase(List<Employee> results)
    {

       for (Employee e:results)
           e.setName(e.getName().toUpperCase());
    }
   }
