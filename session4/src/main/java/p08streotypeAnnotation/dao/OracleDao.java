package p08streotypeAnnotation.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class OracleDao  implements Dao{
    @Override
    public void create() {
        System.out.println("save in DB");
    }
}
