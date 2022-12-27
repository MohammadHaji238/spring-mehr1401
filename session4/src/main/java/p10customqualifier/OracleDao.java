package p10customqualifier;

import org.springframework.stereotype.Component;

@Component
@DataBaseType(value = "oracle",type = "sql")
public class OracleDao implements
Dao{
    @Override
    public void create() {
        System.out.println("create method of oracle invoked");
    }
}
