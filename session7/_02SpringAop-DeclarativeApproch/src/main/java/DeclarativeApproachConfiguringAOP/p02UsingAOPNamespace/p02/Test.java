package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p02;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session7\\_02SpringAop-DeclarativeApproch\\src\\main\\java\\DeclarativeApproachConfiguringAOP\\p02UsingAOPNamespace\\p02\\config.xml");
        context.refresh();
        final EmployeeService employeeService = context.getBean(EmployeeService.class);

    /*    String employeeById = employeeService.findEmployeeById(1);
        System.out.println(employeeById);*/

        employeeService.createEmployee2(new Employee("neda"));

        //  bean.findEmployee();

      /*  String employeeById = bean.findEmployeeById(1);
        System.out.println(employeeById);*/


       //   bean.createEmployee(new Employee("neda"));


     /*   final String employee = bean.findEmployee1(10);
        System.out.println(employee);*/


      //  bean.deleteEmployee();

     //   bean.findAllEmployees();

       // bean.errorrrrrr();

    }
}
