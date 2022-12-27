package p03DI.p04jsr330;

import javax.inject.Named;

@Named(value = "repo2")
public class OracleRepository implements Repository {
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
