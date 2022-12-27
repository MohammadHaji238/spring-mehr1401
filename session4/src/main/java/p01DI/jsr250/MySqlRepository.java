package p01DI.jsr250;


import javax.inject.Named;

@Named(value = "repo1")
public class MySqlRepository implements Repository {
    @Override
    public void create() {
        System.out.println("mysql");
    }
}
