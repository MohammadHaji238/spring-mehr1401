package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/")
public class homeController {

    @GetMapping("now")
    public String sayHello(Model model)
    {
        System.out.println("in controller");
        System.out.println("in controller");

        model.addAttribute("now",new Date());
        return "hello";
    }
}
