package com.example.manytomany;

import com.example.manytomany.entity.Order;
import com.example.manytomany.entity.Product;
import com.example.manytomany.repository.OrderRepository;
import com.example.manytomany.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class ManytomanyApplicationTests {

    @Autowired
    OrderRepository orderRepository;

    @Test
    void contextLoads() {
    }
    @Test
    void createOrder()
    {

        Order order1=new Order(102);
        Order order2=new Order(103);


        Set<Order> orders=new HashSet<>();
        orders.add(order1);
        orders.add(order2);

        Product product1=new Product("note20","ddd",new BigDecimal("1000"));
        Product product2=new Product("iphone12","ddd",new BigDecimal("1000"));



        ///

        Set<Product> products=new HashSet<>();
        products.add(product1);
        products.add(product2);


        order1.setProducts(products);
        order2.setProducts(products);
        product1.setOrders(orders);
        product2.setOrders(orders);


        orderRepository.save(order1);


    }

}
