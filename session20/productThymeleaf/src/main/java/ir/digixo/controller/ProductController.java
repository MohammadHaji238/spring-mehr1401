package ir.digixo.controller;

import ir.digixo.entity.Product;
import ir.digixo.service.ProductService;
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
    @GetMapping("/home")
    public String showHome()
    {
        return "myhome";
    }

    @GetMapping("/products")
    public String getAllProducts(Model  model)
    {
        final List<Product> allProduct = productService.getProducts();
        model.addAttribute("products",allProduct);
       // return "listOfProduct";
       // return "list-products";
        return "product";
    }


    //create
    @GetMapping("/showFormForAdd")
    public String showCreateProductForm(Model model)
    {
        Product product=new Product();
        model.addAttribute("product",product);
        return "Product-form";
    }
    @PostMapping("/saveProduct")
    public String createProduct(@ModelAttribute("product") Product product)
    {
        productService.saveProduct(product);
       // return "list-products";
        return "redirect:/products";
    }



    //update

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("ProductId") Long id,Model model)
    {

        final Product product = productService.getProduct(id);
        model.addAttribute("product",product);
        return "product-form";
    }


    //delete
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("ProductId") Long id,Model model)
    {
        System.out.println("id for delete is "+id);
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
