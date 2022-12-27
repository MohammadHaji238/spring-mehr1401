package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class C02MyAnalyticsAspect {
    private static Logger logger= LoggerFactory.getLogger(C02MyAnalyticsAspect.class);


    @Before("DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs.C04MyAopExperessions.forDaoPackageNoGettersSetters()")
    public void performApiAnalytic()
    {
        logger.info("====> performing api aspect");
    }
}
