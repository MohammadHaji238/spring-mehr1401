package p01DI.jsr250;

import javax.inject.Named;

@Named(value = "repo2")
public class OracleRepository implements Repository {
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
