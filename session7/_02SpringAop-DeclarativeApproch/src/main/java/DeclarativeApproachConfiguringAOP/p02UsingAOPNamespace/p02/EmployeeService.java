package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeService {

    private Employee employee;


    public void findEmployee()
    {
        System.out.println("success-you get an employee") ;
    }
    public String findEmployeeById(int id)
    {
        return "success-you get an employee id:"+id;
    }
    public void createEmployee(Employee employee)
    {
        System.out.println(employee.getName()+" is created!");
    }
    public Integer createEmployee2(Employee employee)
    {
        System.out.println(employee.getName()+" is created!");
        return 12;
    }

    public List<Employee> findAllEmployees()
    {
        return new ArrayList<>(List.of(
                new Employee("mohammad"),
                new Employee("neda"),
                new Employee("ashkan")
        ));
    }
    public  void deleteEmployee()
    {

        System.out.println("delete employee obj");
    }
    public void errorrrrrr()throws Exception
    {
        throw  new Exception("sdd");
    }
}
