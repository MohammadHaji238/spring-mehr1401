package p03DI.p01constructorbased.p02annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyService {

    private Repository repository;

    public MyService() {
    }

    public MyService(Repository repository) {
        this.repository = repository;
    }

    public Repository getRepository() {
        return repository;
    }
    @Autowired
    @Qualifier("repo1")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
