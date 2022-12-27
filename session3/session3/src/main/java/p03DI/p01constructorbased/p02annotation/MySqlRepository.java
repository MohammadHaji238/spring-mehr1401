package p03DI.p01constructorbased.p02annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("repo1")
public class MySqlRepository implements Repository {
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
