package com.anisa.controller;

import com.anisa.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class C01HomeController {

    @GetMapping("/a")
    public String showHomePage()
    {
        //model
        //calling service
        return "home";
    }

    @GetMapping("/a2")
    public ModelAndView m1()
    {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("name","mahsa");
        return modelAndView;
    }

    @GetMapping("/a3")
    public String m2(HttpServletRequest request, ModelMap model)
    {
        String myname = request.getParameter("myname");
        model.addAttribute("myname",myname);
        return "home";
    }

   /* @GetMapping("/vares")
    @ResponseBody
    public String m3()
    {
        return "Hello Rest based App";
    }*/

    @GetMapping("/list")
    public ModelAndView sendList()
    {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("listOfProduct");
        List<Product> products=List.of(
                new Product(1l,"iphone"),
                new Product(2l,"ipod"),
                new Product(3l,"mac")
        );
        modelAndView.addObject("products",products);
        return modelAndView;
    }


    //

    @GetMapping("showForm")
    public String showForm(){
        return "createProduct";
    }

    @PostMapping("/createProduct")
    public ModelAndView createProduct(@ModelAttribute("product") Product product)
    {
        System.out.println(product.getName());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("myname","mahsa");
        return modelAndView;
    }
}
