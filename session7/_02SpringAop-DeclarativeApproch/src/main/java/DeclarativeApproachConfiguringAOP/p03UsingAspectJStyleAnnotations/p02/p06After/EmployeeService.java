package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p06After;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class EmployeeService {
    private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);

    private Employee employee;

    public void addEmployee()
    {
        logger.info(getClass()+" Adding an employee");
    }

    public Employee findEmployees(boolean exc) throws Exception {
       // throw new Exception("fffffffffffff");
        if (exc)
            throw new RuntimeException("my Runtime Exception");

        return new Employee("mahsa");

    }

    public void errorrrrrr()throws Exception
    {
        throw  new Exception("sdd");
    }

    public  void deleteEmployee()
    {
        System.out.println("delete employee obj");
    }
}
