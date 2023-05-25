package com.example.webflux;

import com.example.webflux.dto.MyResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class WebFluxApplicationTests {


    @Autowired
    private WebClient webClient;
    @Test
    void test1() {
        Mono<MyResponse> myResponseMono = webClient
                .get()
                .uri("controller2/m1/{input}", 10)
                .retrieve()
                .bodyToMono(MyResponse.class);

        //System.out.println(block);//Future.get()

        StepVerifier.create(myResponseMono)
                .expectNextMatches(myResponse -> myResponse.getOutput()==100)
                .verifyComplete();
    }

    @Test
    void test2()
    {
        Flux<MyResponse> myResponseFlux = webClient
                .get()
                .uri("controller2/m2/{input}",10)
                .retrieve()
                .bodyToFlux(MyResponse.class)
                .doOnNext(System.out::println);

        StepVerifier.create(myResponseFlux)
                .expectNextCount(10)
                .verifyComplete();

    }
    @Test
    void test3()
    {
        Flux<MyResponse> myResponseFlux = webClient
                .post()
                .uri("controller2/m3/{input}",10)
                .retrieve()
                .bodyToFlux(MyResponse.class)
                .doOnNext(System.out::println);

        StepVerifier.create(myResponseFlux)
                .expectNextCount(10)
                .verifyComplete();

    }


}
