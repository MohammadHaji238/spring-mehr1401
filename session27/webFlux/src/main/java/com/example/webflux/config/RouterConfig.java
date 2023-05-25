package com.example.webflux.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
@Configuration
@AllArgsConstructor
public class RouterConfig {

    private RequestHandler requestHandler;

    @Bean
    public RouterFunction<ServerResponse> serverResponseRouterFunction()
    {
        return RouterFunctions
                .route()
                .GET("router/m11/{input}",requestHandler::m1)
                .GET("router/m22/{input}",requestHandler::m1)
                .build();
    }
}
