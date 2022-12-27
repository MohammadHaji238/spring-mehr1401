package p12collections.p03Class;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01CollectionBean {
    @Autowired
    private List<String> myList;

    public void printMyList()
    {
        System.out.println(myList);
    }

    //Set With Constructor Injection
    private Set<String> mySet;

    public C01CollectionBean(Set<String> mySet) {
        this.mySet = mySet;
    }
    public void printMySet()
    {
        System.out.println(mySet);
    }

    //Map With Setter Injection
    private Map<Integer, String> myMap;

    public void setMyMap(Map<Integer, String> myMap) {
        this.myMap = myMap;
    }
    public void printMyMap()
    {
        System.out.println(myMap);
    }
    // Injecting Bean References
    @Autowired
    private List<C04MyBean> myBeanList;
    public void printmyBeanList()
    {
        System.out.println(myBeanList.size());
    }
}
