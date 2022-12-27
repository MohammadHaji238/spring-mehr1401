package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class C03MyCloudLogAspect {
    private static Logger logger = LoggerFactory.getLogger(C03MyCloudLogAspect.class);


    @Before("DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs.C04MyAopExperessions.forDaoPackageNoGettersSetters()")
    public void logToCloud() {
        logger.info("====> Logging to cloud aspect");
    }

}
