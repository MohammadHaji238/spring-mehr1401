package com.example.webflux.controller;

import com.example.webflux.dto.MyRequest;
import com.example.webflux.dto.MyResponse;
import com.example.webflux.service.MyService1;
import com.example.webflux.service.MyService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/controller2")
public class C02ReactiveController {

    @Autowired
    private MyService2 myservice;

    @GetMapping("/m1/{input}")
    public Mono<MyResponse> m1(@PathVariable int input)
    {
        return myservice.m1(input);
    }
    @GetMapping("/m2/{input}")
    public Flux<MyResponse> m2(@PathVariable int input)
    {
        return myservice.m2(input);
    }

    @GetMapping(value = "/m3/{input}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<MyResponse> m3(@PathVariable int input)
    {
        return myservice.m2(input);
    }

    @PostMapping("m4")
    public Mono<MyResponse> postTest(@RequestBody Mono<MyRequest> myRequest)
    {
        return myservice.postTest(myRequest);
    }
}
