package ir.digixo.p01Hibernate;

import ir.digixo.p01Hibernate.config.Config;
import ir.digixo.p01Hibernate.entities.Category;
import ir.digixo.p01Hibernate.entities.Product;
import ir.digixo.p01Hibernate.service.ProductService;
import ir.digixo.p01Hibernate.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        ProductService productService = context.getBean(ProductService.class);


       /* Category category = new Category();
         category.setName("auto2");

        //  productService.findAllProducts(category);

        //create
        Product product1 = new Product("BMW 2222", 60000);
        category.getProducts().add(product1);
        product1.setCategory(category);
        Product product2 = new Product("BMW 3333", 60000);
        category.getProducts().add(product2);
        product2.setCategory(category);


        productService.createCategory(category);*/


        Category category = new Category();
        category.setId(1l);

        Product product=new Product("benz",3444444);
        product.setCategory(category);

        productService.createProduct(product,category);

    }
}
