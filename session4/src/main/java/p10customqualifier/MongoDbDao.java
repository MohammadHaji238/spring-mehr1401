package p10customqualifier;

import org.springframework.stereotype.Component;

@Component
@DataBaseType(value = "mongo",type = "nosql")
public class MongoDbDao implements
Dao{
    @Override
    public void create() {
        System.out.println("create method of mongo invoked");
    }
}
