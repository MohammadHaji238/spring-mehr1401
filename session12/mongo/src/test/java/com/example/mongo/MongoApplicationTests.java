package com.example.mongo;

import com.example.mongo.entity.Product;
import com.example.mongo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class MongoApplicationTests {


    @Autowired
    private ProductRepository productRepository;
    @Test
    void contextLoads() {
    }

    @Test
    public void saveProduct()
    {
        Product product=new Product();
        product.setName("mac2");
        product.setPrice(new BigDecimal("4000"));
        Product save = productRepository.save(product);
        System.out.println(save.getId());
    }
    @Test
    void findAll() {
        List<Product> all = productRepository.findAll();//ctrl+alt+v
        all.forEach(x-> System.out.println(x.getName()));
    }

    @Test
    void findById() {
        Optional<Product> byId = productRepository.findById("63bd7a14224ba423928c0b9d");
        byId.ifPresent(System.out::println);
    }



}
