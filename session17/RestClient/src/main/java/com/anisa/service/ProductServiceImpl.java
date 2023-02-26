package com.anisa.service;


import com.anisa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.net.http.HttpResponse;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    String restUrl="http://localhost:8080/api/v1/products";

    @Autowired
    private RestTemplate restTemplate;

    @Override

    public List<Product> getProducts() {
        final ResponseEntity<List<Product>> responseEntity = restTemplate
                .exchange(restUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
        });

        final List<Product> products = responseEntity.getBody();
        return products;
    }

    @Override

    public void saveProduct(Product product) {
        final Long id = product.getId();

        if (id==null)
        {
            //save
            restTemplate.postForEntity(restUrl,product,String.class);
        }
        else {
            //update
            restTemplate.put(restUrl,product);
        }
    }

    @Override

    public Product getProduct(Long id) {
      //  return productDao.getProduct(id);
        Product pro = restTemplate.getForObject(restUrl + "/" + id, Product.class);
        return pro;
    }

    @Override

    public void deleteProduct(Long id) {
      //  productDao.deleteProduct(id);
        restTemplate.delete(restUrl + "/" + id);
    }
}
