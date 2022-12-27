package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p08AroundHandlingException;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeService {
    private static Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);

    private Employee employee;

    public String addEmployee(boolean exception)
    {
      if (exception)
          throw  new RuntimeException("my exception");
      return "finished";

    }



   }
