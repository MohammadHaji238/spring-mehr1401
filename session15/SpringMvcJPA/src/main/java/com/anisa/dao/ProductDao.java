package com.anisa.dao;

import com.anisa.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
   List<Product> getProducts();
   void saveProduct(Product product);
   Product getProduct(Long id);
   void deleteProduct(Long id);
}
