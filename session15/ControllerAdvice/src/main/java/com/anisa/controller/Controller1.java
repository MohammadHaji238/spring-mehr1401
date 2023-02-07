package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Controller1 {
    @GetMapping("/controller1/**")
    public String m()
    {
        return "my-page";
    }
}
