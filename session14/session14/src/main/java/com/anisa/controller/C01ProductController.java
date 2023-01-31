package com.anisa.controller;

import com.anisa.entity.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RestController
@RequestMapping("/")
public class C01ProductController {

    @GetMapping(value = "/json1",consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<String> handleRequest1(HttpEntity<String> str){
        System.out.println(str.getHeaders());
        System.out.println(str.getBody());


        HttpEntity<String> httpEntity=new HttpEntity<>("json obj");
        return httpEntity;
    }


    @GetMapping(value = "/json2",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String handleRequest2(@RequestBody String str)
    {
        System.out.println(str);
        return str;
    }

    @GetMapping(value = "/json3",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product handleRequest3()
    {
        Product product=new Product(1l,"mac");
        return product;
    }
    @GetMapping(value = "/json4",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product handleRequest4(@RequestBody Product product)
    {
       product.setName("set in server");
        return product;
    }
    @GetMapping(value = "/json5/{id}/{name}")
    @ResponseBody
    public Product handleRequest5(@ModelAttribute Product product)
    {

        return product;
    }

    @GetMapping(value = "/json6")
    @ResponseBody
    public List<Product> handleRequest6()
    {

        return List.of(
                new Product(1l,"mac book pro"),
                new Product(1l,"mac book air")
        );
    }
    @GetMapping(value = "/json7")
    @ResponseBody
    public List<Product> handleRequest7(@RequestBody List<Product> products)
    {
        return products;
    }

}
