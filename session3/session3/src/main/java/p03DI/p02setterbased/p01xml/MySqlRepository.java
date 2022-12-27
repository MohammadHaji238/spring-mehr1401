package p03DI.p02setterbased.p01xml;


public class MySqlRepository implements Repository {
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
