package com.example.onetoone;

import com.example.onetoone.entity.Product;
import com.example.onetoone.entity.ProductDetails;
import com.example.onetoone.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class OnetooneApplicationTests {

    @Autowired
    ProductRepository repository;

    @Test
    void contextLoads() {
    }


    @Test
    void createProduct() {
        Product product=new Product();
        product.setName("iphone");
        product.setPrice(new BigDecimal("1000"));


        ProductDetails productDetails=new ProductDetails();
        productDetails.setProductDescription("smart phone");

        //
        productDetails.setProduct(product);
        product.setProductDetails(productDetails);

        //
        repository.save(product);
    }

}
