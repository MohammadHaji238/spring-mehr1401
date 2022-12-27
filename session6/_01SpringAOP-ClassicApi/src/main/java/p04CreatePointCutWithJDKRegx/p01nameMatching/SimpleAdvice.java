package p04CreatePointCutWithJDKRegx.p01nameMatching;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(">>invoking "+invocation.getMethod().getName());
        Object retVal = invocation.proceed();
        System.out.println("DONE!");
        return retVal;

    }
}
