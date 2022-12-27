package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProgrammerMonitorAspect {
  //  @Before("execution(public * DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.*.JavaProgrammer+.code(..))")
   // @Before("execution(* DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01.JavaProgrammer.code(..))")
    @Before("execution(public * DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations" +
            ".*.JavaProgrammer+." +
            "code*(..))")

    public void codeExecution(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(" ---> Method " + methodName + "() is about to be called");
    }
   /* An aspect can be created to monitor the execution of the methods of this bean. The
    following code snippet depicts an aspect class definition that contains a single advice
            that prints a message every time the code method is called.
*/
}
