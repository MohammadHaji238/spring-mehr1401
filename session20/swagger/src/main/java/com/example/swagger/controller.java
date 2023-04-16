package com.example.swagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Tag(name = "product rest api for swagger features!!!!")
public class controller {

    @GetMapping("/test")
    @Operation(summary = "test method for get http method")
    @ApiResponse(description = "list of products")
    public String test() {
        return "hello swagger";
    }

    @PostMapping("/test2")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "found of product"),
            @ApiResponse(responseCode = "404", description = "not found of product")

    })
    public String test2() {
        return "hello swagger";
    }
}
