package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p04AfterReturning;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class EmployeeService {
    private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);

    private Employee employee;



    public List<Employee> findEmployees()
    {
        return new ArrayList<>(List.of(
                new Employee("neda"),
                new Employee("reza"),
                new Employee("javad")
        ));
    }

   }
