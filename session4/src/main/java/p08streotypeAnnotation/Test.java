package p08streotypeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import p08streotypeAnnotation.WebHandler.MyController;

public class Test {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(Config.class);
        final MyController controller = context.getBean(MyController.class);
        controller.create();
    }
}
