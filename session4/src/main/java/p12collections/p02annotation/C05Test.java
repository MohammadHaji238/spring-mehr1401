package p12collections.p02annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C05Test {
    public static void main(String[] args) {
      var context=new AnnotationConfigApplicationContext(Config.class);
        final C04CollectionBean complexObject = context.getBean("c04CollectionBean", C04CollectionBean.class);
        complexObject.displayInfo();
    }
}
