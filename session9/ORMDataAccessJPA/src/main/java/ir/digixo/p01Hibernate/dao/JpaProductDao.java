package ir.digixo.p01Hibernate.dao;

import ir.digixo.p01Hibernate.entities.Category;
import ir.digixo.p01Hibernate.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
@Repository
public class JpaProductDao implements ProductDao {


    @PersistenceContext
   private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Collection loadProductsByCategory(Category category) {
        return null;
    }

    public void createProduct(Product product, Category category){
      //  product.setCategory(category);
        entityManager.persist(product);
    }

    public void createCategory(Category category){

        entityManager.persist(category);
        entityManager.flush();
        System.out.println(category.getId());
    }



    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }
   /* public void deleteProduct(Product product)
    {
        sessionFactory.getCurrentSession().delete(product);
    }
    public void updateProduct(Product product)
    {
        sessionFactory.getCurrentSession().update(product);
    }*/
}
