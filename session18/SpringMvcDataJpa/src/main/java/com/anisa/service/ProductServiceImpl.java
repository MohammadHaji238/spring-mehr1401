package com.anisa.service;

import com.anisa.dao.ProductDao;
import com.anisa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public List<Product> getProducts() {
        return productDao.findAll();
    }

    @Override
    @Transactional//first level cache
    public void saveProduct(Product product) {
        productDao.save(product);
    }

    @Override
    @Transactional
    public Optional<Product> getProduct(Long id) {
        return productDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }
}
