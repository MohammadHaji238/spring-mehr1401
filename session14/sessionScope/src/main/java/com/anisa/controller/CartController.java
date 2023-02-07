package com.anisa.controller;

import com.anisa.entity.ShoppingCart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
@SessionAttributes("shoppingCart")
public class CartController {


    @GetMapping("/home")
    public String home()
    {
        return "addToCart";
    }

    @ModelAttribute("shoppingCart")
    public ShoppingCart shoppingCart()
    {
        return new ShoppingCart();
    }

    @PostMapping("/addToCart")
    public String addToCart(Model  model,@ModelAttribute ShoppingCart shoppingCart,String productName)
    {
        shoppingCart.addProduct(productName);
        model.addAttribute("card",shoppingCart);
        return "redirect:" +"product-page";
    }

    @GetMapping("product-page")
    public String viewProductCart(Model  model,@ModelAttribute("shoppingCart") ShoppingCart shoppingCart)
    {
        if (shoppingCart!=null)
            model.addAttribute("card",shoppingCart);
        else
            model.addAttribute("card",new ShoppingCart());
        return "addToCart";
    }

    @GetMapping("/card")
    public String cart(@SessionAttribute("shoppingCart") ShoppingCart card,Model model)
    {
        model.addAttribute("card",card);
        return "card";
    }

}
