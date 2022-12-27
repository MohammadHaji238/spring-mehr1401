package p03PointcutInterface.p01static;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
   /* @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return "code".equals(method.getName());
    }*/
      @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("Static check for " + method.getName());
        return ("m1".equals(method.getName()));
    }

   /* @Override
    public ClassFilter getClassFilter() {
        return clazz->clazz==JavaProgrammer.class;
    }*/

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return clazz==JavaProgrammer.class;
            }
        };
    }
}
