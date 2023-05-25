package com.example.webflux.service;

import com.example.webflux.dto.MyRequest;
import com.example.webflux.dto.MyResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MyService2 {
    //reactive
    public Mono<MyResponse> m1(int i) {
        return Mono.fromSupplier(() -> i * i)
                .map(MyResponse::new);
    }

    public Flux<MyResponse> m2(int i) {
       /* List<MyResponse> collect = IntStream.rangeClosed(1, 5)
                //foreach
                .peek(value -> Util.sleepSecond(1))
                .peek(value -> System.out.println("processing :" + value))
                .mapToObj(value -> new MyResponse(i * value))
                .collect(Collectors.toList());

        return Flux.fromIterable(collect);*/

        return Flux.range(1, 10)
                //.doOnNext(integer -> Util.sleepSecond(1))
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(integer -> System.out.println("reactive processing :" + integer))
                .map(integer -> new MyResponse(i * integer));
    }

    public Mono<MyResponse> postTest(Mono<MyRequest> requestMono)
    {
        return requestMono
                .map(myRequest -> myRequest.getI()* myRequest.getJ())
                .map(MyResponse::new);
    }
}
