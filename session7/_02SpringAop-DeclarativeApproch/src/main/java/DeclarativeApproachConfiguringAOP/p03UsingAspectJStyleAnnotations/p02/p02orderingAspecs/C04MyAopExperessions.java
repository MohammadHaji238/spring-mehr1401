package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
public class C04MyAopExperessions {

    @Pointcut("execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs..*(..))")
    public void  forDaoPackage()
    {

    }
    @Pointcut("execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs.*.get*(..))")
    public void  forGetters()
    {

    }
    @Pointcut("execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs.*.set*(..))")
    public void  forSetters()
    {

    }

    //create pointcut:include package... exclude getters/setters
    @Pointcut("forDaoPackage() && ! (forGetters() || forSetters())")
    public void  forDaoPackageNoGettersSetters()
    {

    }
}
