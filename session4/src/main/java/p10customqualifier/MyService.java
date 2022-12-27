package p10customqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    private Dao dao;

    public Dao getDao() {
        return dao;
    }

    @Autowired
    @DataBaseType(value = "mongo",type = "nosql")
    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
