package p02BeanScopes.p01singleton.p01xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p02BeanScopes\\p01singleton\\p01xml\\config.xml");
        context.refresh();

        final ProductService bean1 = context.getBean("productService1",ProductService.class);
        System.out.println(bean1.getProductDao());

        final ProductService bean2 = context.getBean("productService2",ProductService.class);
        System.out.println(bean2.getProductDao());

        final ProductService bean3 = context.getBean("productService3",ProductService.class);
        System.out.println(bean3.getProductDao());
    }
}
