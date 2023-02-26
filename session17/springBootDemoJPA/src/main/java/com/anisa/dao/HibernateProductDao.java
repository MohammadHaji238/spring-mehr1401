package com.anisa.dao;

import com.anisa.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HibernateProductDao implements ProductDao{

    @PersistenceContext
    EntityManagerFactory entityManagerFactory;

    @Autowired
    public HibernateProductDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Product> getProducts() {
        return sessionFactory.getCurrentSession()
                .createQuery("from product  order by price DESC")
                .getResultList();
    }

    @Override
    public void saveProduct(Product product) {

       // sessionFactory.getCurrentSession().save(product);
        sessionFactory.getCurrentSession().saveOrUpdate(product);
    }

    @Override
    public Product getProduct(Long id) {
        return sessionFactory.getCurrentSession().get(Product.class,id);
    }

    @Override
    public void deleteProduct(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete from product  where  id=:productId")
                .setParameter("productId",id)
                .executeUpdate();
    }
}
