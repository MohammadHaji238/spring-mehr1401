package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p05AfterThrowing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final EmployeeService bean = context.getBean(EmployeeService.class);
       // bean.setEmployee(new Employee("hasan"));
     // bean.addEmployee();
       // bean.findEmployees().forEach(x-> System.out.println(x.getName()));
        bean.findEmployees(false);

    }
}
