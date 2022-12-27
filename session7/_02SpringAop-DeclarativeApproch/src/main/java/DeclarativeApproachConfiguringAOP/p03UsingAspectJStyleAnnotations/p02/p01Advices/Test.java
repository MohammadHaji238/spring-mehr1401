package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final EmployeeService bean = context.getBean(EmployeeService.class);
        bean.setEmployee(new Employee("hasan"));
     // bean.addEmployee();
      //bean.deleteEmployee();
        String employee = bean.findEmployee();
       // System.out.println(employee);
        // bean.errorrrrrr();

    }
}
