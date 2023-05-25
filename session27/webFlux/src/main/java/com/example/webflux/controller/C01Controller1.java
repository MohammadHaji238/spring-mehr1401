package com.example.webflux.controller;

import com.example.webflux.dto.MyResponse;
import com.example.webflux.service.MyService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/controller1")
public class C01Controller1 {

    @Autowired
    private MyService1 myservice;

    @GetMapping("/m1/{input}")
    public MyResponse m1(@PathVariable int input)
    {
        return myservice.m1(input);
    }
    @GetMapping("/m2/{input}")
    public List<MyResponse> m2(@PathVariable int input)
    {
        return myservice.m2(input);
    }
}
