package p03DI.p02setterbased.p03classconfig;


public class MyService {

    private Repository repository;

  /*  public MyService() {
    }*/

    public MyService(Repository repository) {
        this.repository = repository;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
