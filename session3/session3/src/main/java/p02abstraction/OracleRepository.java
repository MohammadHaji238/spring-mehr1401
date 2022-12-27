package p02abstraction;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OracleRepository implements Repository{
    @Override
    public void create() {
        System.out.println("oracle");
    }
}
