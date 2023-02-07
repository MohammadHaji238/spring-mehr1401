package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestMapping("/")
public class C01ControllerResolver {

    @GetMapping("/one")
    public void one()
    {
        throw  new NullPointerException("khali bood");
    }
}
