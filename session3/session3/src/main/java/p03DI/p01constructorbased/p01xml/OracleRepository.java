package p03DI.p01constructorbased.p01xml;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class OracleRepository implements Repository {
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
