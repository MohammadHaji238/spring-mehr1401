package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        var context=new AnnotationConfigApplicationContext(Config.class);
        final EmployeeService bean = context.getBean(EmployeeService.class);
      //  bean.setEmployee(new Employee("hassan"));

        bean.addEmployee();
      //bean.addEmployee(new Employee("hasan"));

    }
}
