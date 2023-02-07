package com.anisa.controller;

import com.anisa.entity.Product;
import com.anisa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/allProducts")
    public String getAllProducts(Model model)
    {
        List<Product> products = productService.getProducts();
        model.addAttribute("products",products);
        return "list-products";
    }

    //add product
    @GetMapping("/formForAddProduct")
    public String formForAddProduct(Model model)
    {
        Product product=new Product();
        model.addAttribute("product",product);
        return "addProduct";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product)
    {
        productService.saveProduct(product);
        return "redirect:allProducts";
    }


    //update
    @GetMapping("/formForUpdate")
    public String formForUpdate(@RequestParam("ProductId") Long id,Model model)
    {
        Product product = productService.getProduct(id);
        model.addAttribute("product",product);
        return "addProduct";
    }

    //delete
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("ProductId") Long id,Model model)
    {
        productService.deleteProduct(id);
        return "redirect:allProducts";
    }
}
