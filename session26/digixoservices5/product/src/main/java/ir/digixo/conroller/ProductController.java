package ir.digixo.conroller;

import ir.digixo.dto.ProductRequest;

import ir.digixo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody ProductRequest productRequest){

        log.info("new product created {}",productRequest);
        productService.createProduct(productRequest);

    }
}
