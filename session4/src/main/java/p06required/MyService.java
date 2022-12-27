package p06required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyService {
  private MyDao dao;

    public MyService() {
        System.out.println("service created!");
    }


   /* @Autowired(required = false)
    public void setDao(MyDao dao) {
        this.dao = dao;
    }*/
  /* @Autowired
   public void setDao( @Nullable MyDao dao) {
       this.dao = dao;
   }*/

    @Autowired
    public void setDao( Optional<MyDao> dao) {
        dao.ifPresent(myDao -> this.dao=myDao);
    }

    public MyDao getDao() {
        return dao;
    }
}
