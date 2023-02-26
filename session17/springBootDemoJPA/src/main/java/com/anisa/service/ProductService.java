package com.anisa.service;

import com.anisa.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    void saveProduct(Product product);
    Product getProduct(Long id);
    void deleteProduct(Long id);
}
