package com.anisa.service;

import com.anisa.entity.Product;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> getProducts();
    void saveProduct(Product product);

    Optional<Product> getProduct(Long id);

    void deleteProduct(Long id);


}
