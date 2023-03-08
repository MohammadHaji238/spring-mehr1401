package com.anisa.controller;

import com.anisa.entity.Product;
import com.anisa.exception.ProductNotFoundException;
import com.anisa.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductRestController {
    //private static  final Logger  log= LoggerFactory.getLogger(ProductRestController.class);
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts()
    {
        log.info("get All Products");
        List<Product> products = productService.getProducts();
        return products;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id)
    {
        Optional<Product> product = productService.getProduct(id);
        product.orElseThrow(() -> new ProductNotFoundException("product is not found with id"+id));
        return product.get();
    }

    //add product
  /*  @GetMapping("/formForAddProduct")
    public String formForAddProduct(Model model)
    {
        Product product=new Product();
        model.addAttribute("product",product);
        return "addProduct";
    }*/

    @PostMapping
    public String saveProduct(@Valid @RequestBody Product product)
    {
        productService.saveProduct(product);
        return "product saved";
    }


    //update
  /*  @GetMapping("/formForUpdate")
    public String formForUpdate(@RequestParam("ProductId") Long id,Model model)
    {
        Product product = productService.getProduct(id);
        model.addAttribute("product",product);
        return "addProduct";
    }*/
    @PutMapping
    public String updateProduct(@RequestBody Product product)
    {
        productService.saveProduct(product);
        return "product update";
    }

    //delete
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id)
    {
        productService.deleteProduct(id);
        return "product delete";
    }


}
