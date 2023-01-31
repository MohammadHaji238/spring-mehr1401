package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class C04InterceptorController {

    @GetMapping("/interceptor")
    public String m(@RequestAttribute("count") Integer count)
    {
        System.out.println(count);
        return "view2";
    }
}
