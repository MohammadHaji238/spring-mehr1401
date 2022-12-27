package p03DI.p01constructorbased.p02annotation;

import org.springframework.stereotype.Component;

@Component("repo2")
public class OracleRepository implements Repository {
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
