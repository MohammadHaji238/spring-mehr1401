package p01DI.jsr250;

import javax.annotation.Resource;
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


    @Resource(name = "repo1")
    public void setRepository( Repository repository) {
        this.repository = repository;
    }
}
