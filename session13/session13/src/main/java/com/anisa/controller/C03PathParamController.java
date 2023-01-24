package com.anisa.controller;

import com.anisa.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class C03PathParamController {


    //url/{id}/{name}
    //url/12/mac
    @GetMapping("/getProductWithPthVariable/{id}/{name}")
    public ModelAndView getProductWithPthVariable(@PathVariable("id") Long id,@PathVariable("name") String name)
    {


        Product product=new Product(id,name);
        System.out.println(product.getId());
        System.out.println(product.getName());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("product");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
}
