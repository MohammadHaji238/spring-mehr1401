package com.anisa.controller;

import com.anisa.entity.Product;
import com.anisa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts()
    {
        List<Product> products = productService.getProducts();
        return products;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id)
    {
        Product product = productService.getProduct(id);
        return product;
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
    public String saveProduct(@RequestBody Product product)
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
