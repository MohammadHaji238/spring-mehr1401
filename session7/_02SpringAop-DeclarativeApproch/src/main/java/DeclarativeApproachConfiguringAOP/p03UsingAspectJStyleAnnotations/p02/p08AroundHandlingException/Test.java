package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p08AroundHandlingException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final EmployeeService bean = context.getBean(EmployeeService.class);
        bean.setEmployee(new Employee("hasan"));
     // bean.addEmployee();
        final String s = bean.addEmployee(true);
        System.out.println("in main : "+s);
    }
}
