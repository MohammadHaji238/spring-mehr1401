package p12collections.p02annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
@Service
public class C04CollectionBean {
   // @Resource(name = "props")
    @Autowired
    @Qualifier(value = "props")
    private Properties prop ;
    @Resource(name = "list")
    private List lists ;
    @Resource(name = "map")
    private Map<String, Object> maps;
    @Resource(name = "set")
    private Set sets ;


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
