package com.anisa.service;

import com.anisa.dao.ProductDao;
import com.anisa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @Override
    @Transactional
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }

    @Override
    @Transactional
    public Product getProduct(Long id) {
        return productDao.getProduct(id);
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        productDao.deleteProduct(id);
    }
}
