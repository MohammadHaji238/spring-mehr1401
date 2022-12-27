package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p07Around;

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

    public String addEmployee()
    {
        try {
            Thread.sleep(15000);
           // TimeUnit.SECONDS.sleep(5000);
            logger.info(getClass()+" Adding an employee");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "finished";

    }


}
