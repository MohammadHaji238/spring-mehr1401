package p03DI.p01constructorbased.p03classconfig;

import org.springframework.stereotype.Component;


public class OracleRepository implements Repository {
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
