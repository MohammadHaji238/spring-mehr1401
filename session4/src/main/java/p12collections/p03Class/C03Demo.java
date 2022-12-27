package p12collections.p03Class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C03Demo {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(C02CollectionConfig.class);
        final C01CollectionBean myList = context.getBean("getCollectionsBean", C01CollectionBean.class);
        System.out.println("list");
        myList.printMyList();
        System.out.println("set");
        myList.printMySet();
        System.out.println("map");
        myList.printMyMap();



        myList.printmyBeanList();
    }
}
