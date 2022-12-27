package p03PointcutInterface.p02dynamic;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class C02SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("Dynamic check for " + method.getName());
        int x = ((Integer) args[0]).intValue();
      //  return (x != 100);
        return (x > 100);
    }

   /* @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("Static check for " + method.getName());
        return ("m1".equals(method.getName()));
    }*/
   @Override
   public boolean matches(Method method, Class<?> targetClass) {
       return "m1".equals(method.getName());
   }


    @Override
    public ClassFilter getClassFilter() {
        return clazz->clazz==C01MyBean.class;
    }
}
