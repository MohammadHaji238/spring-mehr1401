package ir.digixo.service;

import ir.digixo.entity.Product;
import ir.digixo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class  ProductServiceImpl  implements ProductService{
    @Autowired
    private ProductRepository productRepository;


    @Override
    @Transactional
    public List<Product> getProducts() {
      //  return productDao.getAllProduct();
        return productRepository.findAll();
    }

    @Override
    @Transactional
    public void saveProduct(Product product) {
       // productDao.saveProduct(product);
       productRepository.save(product);
    }

    @Override
    @Transactional
    public Product getProduct(Long id) {
        //return productDao.getProduct(id);
        return productRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        System.out.println("id for delete in service :"+id);
      //  productDao.deleteProduct(id);
        productRepository.deleteById(id);
    }
}
