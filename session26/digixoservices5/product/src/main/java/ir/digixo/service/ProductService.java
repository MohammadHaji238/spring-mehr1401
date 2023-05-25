package ir.digixo.service;


import ir.digixo.dto.ProductRequest;
import ir.digixo.entity.Coupon;
import ir.digixo.entity.Product;

import ir.digixo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RestTemplate restTemplate;








    public Product createProduct(ProductRequest productRequest) {
        Product product = new Product(productRequest.getName(), productRequest.getDescription(), productRequest.getPrice());


          Coupon coupon = restTemplate.getForObject("http://localhost:8085/api/v1/coupons/{code}", Coupon.class,productRequest.getCode());
     /*   Coupon coupon = restTemplate.getForObject("http://DISCOUNT/api/v1/coupons/{code}", Coupon.class,productRequest.getCode());
      */
        BigDecimal subtract = new BigDecimal("100").subtract(coupon.getDiscount());
        product.setPrice(subtract.multiply(product.getPrice()).divide(new BigDecimal("100")));




        Product save = productRepository.save(product);




        return save;
    }

}
