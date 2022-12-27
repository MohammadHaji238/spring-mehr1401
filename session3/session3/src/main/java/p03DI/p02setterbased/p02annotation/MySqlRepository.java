package p03DI.p02setterbased.p02annotation;

import org.springframework.stereotype.Component;

@Component("repo1")
public class MySqlRepository implements Repository {
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
