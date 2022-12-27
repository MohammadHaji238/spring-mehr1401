package p03DI.p04jsr330;

import javax.inject.Named;

@Named(value = "repo1")
public class MySqlRepository implements Repository {
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
