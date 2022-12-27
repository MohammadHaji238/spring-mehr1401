package ir.digixo.dynamicProxy;

import java.lang.reflect.*;

public class IHandler implements InvocationHandler {

    private Object targetRef;

    private IHandler(Object targetRef) {
        this.targetRef = targetRef;
    }

    public static Object createFor(Object target) {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                        target.getClass().getInterfaces(),
                                                        new IHandler(target) );
    }

    // Called by dynamic proxy, when method is invoked
    @Override
    public Object invoke(Object dynamicProxy, Method m, Object[] args) throws Throwable {

        //System.out.println( "Dynamic Proxy Class Name: " + dynamicProxy.getClass().getName() ); // com.sun.proxy.$Proxy0

        Object result;
        try {

            System.out.println("before method " + m.getName());
            long start = System.nanoTime();

            result = m.invoke(targetRef, args); // call the Target method

            long end = System.nanoTime();
            System.out.println(String.format("%s took %d ns", m.getName(), (end - start)));

        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        } finally {
            System.out.println("after method " + m.getName());
        }

        return result;

    }
    
}
