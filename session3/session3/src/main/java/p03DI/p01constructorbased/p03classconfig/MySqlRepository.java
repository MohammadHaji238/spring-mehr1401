package p03DI.p01constructorbased.p03classconfig;

import org.springframework.stereotype.Component;


public class MySqlRepository implements Repository {
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
