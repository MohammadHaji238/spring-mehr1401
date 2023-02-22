package com.anisa.controller;


import com.anisa.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    List<Product> products;

    @PostConstruct
    public void loadProducts()
    {

        products=List.of(
                new Product(1l,"iphone","phone",new BigDecimal("1000")),
                new Product(2l,"ipod","ipod",new BigDecimal("1500")),
                new Product(3l,"mac","laptop",new BigDecimal("4000"))
        );
    }

    @GetMapping
    public List<Product> getProducts()
    {
        return products;
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id)
    {
        return products.get(id);
    }
}
