package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class C03ModelAttribute {

    //@ModelAttribute
    //1-method argument
    //2-on method


    @GetMapping("/model1")
    public String addAttribute1()
    {
        return "view1";
    }

  /* @ModelAttribute
    public void addAttribute2(Model model)
    {
        model.addAttribute("msg","hello World");

    }*/

    @ModelAttribute("msg")
    public String addAttribute2()
    {
        return "hello World2";
    }

    @ModelAttribute("now")
    public LocalDateTime now()
    {
        return LocalDateTime.now();
    }

}
