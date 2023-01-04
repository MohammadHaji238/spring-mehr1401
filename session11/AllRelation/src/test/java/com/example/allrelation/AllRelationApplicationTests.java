package com.example.allrelation;

import com.example.allrelation.entity.Category;
import com.example.allrelation.entity.Order;
import com.example.allrelation.entity.Product;
import com.example.allrelation.entity.ProductDetails;
import com.example.allrelation.repository.CategoryRepository;
import com.example.allrelation.repository.OrderRepository;
import com.example.allrelation.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class AllRelationApplicationTests {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;


    @Test
    void createAll() {

        Category category = new Category("auto");


        Product benz = new Product("benz", new BigDecimal("10000"), category);

        ProductDetails pd1 = new ProductDetails();
        pd1.setProductDescription("benzzzzzzz");
        pd1.setProduct(benz);
        benz.setProductDetails(pd1);


        category.getProducts().add(benz);

        Product bmw = new Product("bmw", new BigDecimal("100000"), category);

        ProductDetails pd2 = new ProductDetails();
        pd2.setProductDescription("bmwwwwwwwwww");
        pd2.setProduct(bmw);
        bmw.setProductDetails(pd2);


        category.getProducts().add(bmw);

        //todo: save cagetory

        categoryRepository.save(category);

        //order====>many to many

        Order order1 = new Order(102);
        Order order2 = new Order(103);


        Set<Order> orders = new HashSet<>();
        orders.add(order1);
        orders.add(order2);


        Set<Product> products = new HashSet<>();
        products.add(benz);
        products.add(bmw);

        order1.setProducts(products);
        order2.setProducts(products);
        benz.setOrders(orders);
        bmw.setOrders(orders);


        orderRepository.save(order1);
    }

}
