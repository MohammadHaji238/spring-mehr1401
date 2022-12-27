package p06required;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
public class MyDao {
    public MyDao() {
        System.out.println("dao created");
    }

    public void create()
    {
        System.out.println("create method of dao invoked");
    }
}
