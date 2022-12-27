package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p01;

import org.aspectj.lang.JoinPoint;

public class AduitAdvice  {
    void simpleBeforeAdvice(JoinPoint  joinPoint)
    {
        System.out.println("Executing: "+
                joinPoint.getSignature().getDeclaringTypeName()+" "+
                joinPoint.getSignature().getName());
    }


}
