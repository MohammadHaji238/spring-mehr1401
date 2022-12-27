package p12collections.p01xml;

import lombok.Data;

import java.util.*;
@Data
public class C01CollectionBean {
    private Properties prop = new Properties();
    private List<String> lists = new ArrayList<>();
    private Map<String, String> maps = new HashMap<>();
    private Set<String> sets = new HashSet<>();


    public void displayInfo()
    {
        //
        System.out.println("\nMap Contents: \n");
        maps.entrySet().stream().forEach(e->{
            System.out.println("key: "+e.getKey()+" value: "+e.getValue());
        });
        //
        System.out.println("\nProperties Contents: \n");
        prop.entrySet().stream().forEach(e->{
            System.out.println("key: "+e.getKey()+" value: "+e.getValue());
        });
        //
        System.out.println("\nSet Contents: \n");
       // sets.forEach(System.out::println);
        sets.forEach(obj-> System.out.println("value: "+obj));
        //
        System.out.println("\nList Contents: \n");
       // lists.forEach(System.out::println);
        lists.forEach(obj-> System.out.println("value: "+obj));
    }
}
