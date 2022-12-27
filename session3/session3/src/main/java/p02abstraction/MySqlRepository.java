package p02abstraction;

import org.springframework.stereotype.Component;

@Component
public class MySqlRepository implements Repository{
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
