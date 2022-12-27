package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p06After;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final EmployeeService bean = context.getBean(EmployeeService.class);

        Employee employees = bean.findEmployees(true);
        System.out.println(employees);

    }
}
