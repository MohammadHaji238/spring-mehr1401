package p03DI.p02setterbased.p02annotation;

import org.springframework.stereotype.Component;

@Component("repo2")
public class OracleRepository implements Repository {
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
