package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class C01MyLoggingAspect {
    private static Logger logger = LoggerFactory.getLogger(C01MyLoggingAspect.class);


    @Before("DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs.C04MyAopExperessions.forDaoPackageNoGettersSetters()")
    public void beforeAddEmployee() {
        logger.info("====>simple Logging   aspect");
    }


    //JoinPoint
    //for accessing parameters of method and log them with AOP
  /* @Before("DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs.C04MyAopExperessions.forDaoPackageNoGettersSetters()")
   public void beforeAddEmployee(JoinPoint joinPoint) {
       //Access and display method signature
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
       logger.info("====>method signature is :"+signature);

       //Access and display method args
       final Object[] args = joinPoint.getArgs();
       for (Object o:args)
       {
           if (o instanceof Employee)
           {
               logger.info(((Employee) o).getName());
           }
       }
   }*/

}
