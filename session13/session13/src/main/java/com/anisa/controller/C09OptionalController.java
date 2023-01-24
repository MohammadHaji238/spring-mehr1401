package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class C09OptionalController {

    @GetMapping("/optional1")
    public String getName1(@RequestParam(value = "name",required = false) String name)
    {
        System.out.println(name);
        return  "product";
    }

    @GetMapping("/optional2")
    public String getName2(@RequestParam(value = "name",required = false) Optional<String> name)
    {

        name.ifPresent(System.out::println);
        return  "product";
    }

}
