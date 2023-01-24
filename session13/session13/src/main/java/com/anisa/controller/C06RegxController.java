package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class C06RegxController {


    @GetMapping(value = "/regx/{name:[a-z]+[A-Z]}")
    public String regx(@PathVariable String name)
    {
        System.out.println("regx");
        return "product";
    }
}
