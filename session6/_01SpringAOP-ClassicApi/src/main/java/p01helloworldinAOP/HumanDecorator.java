package p01helloworldinAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//1,2-act as around advice in HumanDecorator aspect
public class HumanDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("Hello ");
        Object proceed = invocation.proceed();//call target method
        System.out.print("!");
        return proceed;
    }
    //
    //m
}
