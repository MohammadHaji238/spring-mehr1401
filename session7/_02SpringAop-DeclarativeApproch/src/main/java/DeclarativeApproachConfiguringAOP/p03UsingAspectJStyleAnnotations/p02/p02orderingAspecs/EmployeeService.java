package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p02orderingAspecs;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Data
@Slf4j
public class EmployeeService {


    private Employee employee;

    public void addEmployee()
    {
        log.info(getClass()+" Adding an employee");
    }
    public void addEmployee(Employee employee)
    {
        log.info(getClass()+" Adding an employee==> "+employee.getName());
    }

  /*  public String findEmployee()
    {
        return "success-you get an employee";
    }

    public void errorrrrrr()throws Exception
    {
        throw  new Exception("sdd");
    }

    public  void deleteEmployee()
    {
        System.out.println("delete employee obj");
    }*/
}
