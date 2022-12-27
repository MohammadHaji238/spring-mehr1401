package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p01Advices;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeService {
    private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);

    private Employee employee;

    public void addEmployee()
    {
        logger.info(getClass()+" Adding an employee");
    }

    public String findEmployee()
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
    }
}
