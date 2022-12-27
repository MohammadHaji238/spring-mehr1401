package p02abstraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    private Repository repository;

    public Repository getRepository() {
        return repository;
    }
    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
