package com.anisa.dao;

import com.anisa.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HibernateProductDao implements ProductDao{


    @PersistenceContext
   EntityManager entityManager;



    @Override
    public List<Product> getProducts() {
        return entityManager
                .createQuery("from product  order by price DESC",Product.class)
                .getResultList();
    }

    @Override
    public void saveProduct(Product product) {

        entityManager.merge(product);
    }

    @Override
    public Product getProduct(Long id) {
        return entityManager.find(Product.class,id);
    }

    @Override
    public void deleteProduct(Long id) {
        entityManager.createQuery("delete from product  where  id=:productId")
                .setParameter("productId",id)
                .executeUpdate();
    }
}
