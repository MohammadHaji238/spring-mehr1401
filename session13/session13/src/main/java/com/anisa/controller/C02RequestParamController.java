package com.anisa.controller;

import com.anisa.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class C02RequestParamController {


    @GetMapping("/getproductparam")
    public ModelAndView getProductWithParm(@RequestParam(value = "id") Long id,@RequestParam("name") String name)
    {


        Product product=new Product(id,name);


        System.out.println(product);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("name","mahsa");
        return modelAndView;
    }
}
