package p03DI.p04jsr330;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "service")
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


    @Inject
    public void setRepository(@Named("repo1") Repository repository) {
        this.repository = repository;
    }
}
