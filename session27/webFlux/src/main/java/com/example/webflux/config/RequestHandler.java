package com.example.webflux.config;

import com.example.webflux.dto.MyRequest;
import com.example.webflux.dto.MyResponse;
import com.example.webflux.service.MyService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class RequestHandler {
    @Autowired
    private MyService2 myservice;


    public Mono<ServerResponse> m1(ServerRequest request)
    {

        String input = request.pathVariable("input");
        Mono<MyResponse> myResponseMono = myservice.m1(Integer.parseInt(input));
        return ServerResponse.ok().body(myResponseMono,MyResponse.class);
    }

  /*  public Flux<MyResponse> m2(@PathVariable int input)
    {
        return myservice.m2(input);
    }


    public Flux<MyResponse> m3(@PathVariable int input)
    {
        return myservice.m2(input);
    }


    public Mono<MyResponse> postTest(@RequestBody Mono<MyRequest> myRequest)
    {
        return myservice.postTest(myRequest);
    }*/
}
