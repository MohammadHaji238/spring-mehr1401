package com.anisa.controller;

import com.anisa.entity.Product;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/")
public class ProductController {


    @GetMapping("/showForm")
    public String getAllProducts(Model model) {
        model.addAttribute("product", new Product());
        return "product";
    }

    //add product
    @PostMapping(value = "/processForm")
    public String processForm(@Valid @ModelAttribute("product") Product product,
                              BindingResult bindingResult) {
        System.out.println("Binding Result is"+bindingResult );
       if (bindingResult.hasErrors())
           return "product";
       else
        return "product-ok";
    }

    @InitBinder
    public void initBinder(@NotNull WebDataBinder dataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }


}
