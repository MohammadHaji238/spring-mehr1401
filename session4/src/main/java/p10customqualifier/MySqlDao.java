package p10customqualifier;

import org.springframework.stereotype.Component;

@Component
@DataBaseType(value = "mysql",type = "sql")
public class MySqlDao  implements
Dao{
    @Override
    public void create() {
        System.out.println("create method of mysql inviked");
    }
}
