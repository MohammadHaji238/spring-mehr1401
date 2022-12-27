package p02advices.p03aroundAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class C02AdviceInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // run code before method execution
        System.out.println("Before target method execution " + invocation.getMethod().getName());
        // target method execution
        Object retVal = invocation.proceed();
        // run code after method execution
        System.out.println("After target method execution " + invocation.getMethod().getName());
        return retVal;
    }
}
