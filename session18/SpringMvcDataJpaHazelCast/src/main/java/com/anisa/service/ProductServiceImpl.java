package com.anisa.service;

import com.anisa.dao.ProductDao;
import com.anisa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
    @CacheEvict(cacheNames = "product-cache",key = "#product.id")
    public void saveProduct(Product product) {
        productDao.save(product);
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(cacheNames = "product-cache",key = "#id")
    public Optional<Product> getProduct(Long id) {
        return productDao.findById(id);
    }

    @Override
    @Transactional
    @CacheEvict(cacheNames = "product-cache",key = "#id")
    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }
}
