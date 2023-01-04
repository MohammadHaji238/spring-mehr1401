package com.example.cache;

import com.example.cache.entity.Product;
import com.example.cache.repository.ProductRepository;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Optional;

@SpringBootTest
class CacheApplicationTests {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    EntityManager entityManager;



    @Test
    void contextLoads() {
    }

    @Test
    @Transactional //firstLevelCache enabled
    void firstLevelCache()
    {
        Optional<Product> product1 = productRepository.findById(1l);
        Optional<Product> product2 = productRepository.findById(1l);
    }

    @Test
    @Transactional //firstLevelCache enabled
    void evictFromCache()
    {
        Session session = entityManager.unwrap(Session.class);


        Optional<Product> product1 = productRepository.findById(1l);
        session.evict(product1.get());
        Optional<Product> product2 = productRepository.findById(1l);
    }

    @Test
    @Transactional //firstLevelCache enabled
    void secondLevelCache()
    {
        Session session = entityManager.unwrap(Session.class);


        Optional<Product> product1 = productRepository.findById(1l);
        session.evict(product1.get());
        Optional<Product> product2 = productRepository.findById(1l);
    }

}
