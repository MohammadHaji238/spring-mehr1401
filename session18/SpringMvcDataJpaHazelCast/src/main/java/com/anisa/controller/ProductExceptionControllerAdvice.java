package com.anisa.controller;

import com.anisa.exception.ProductErrorResponse;
import com.anisa.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

//@ControllerAdvice
public class ProductExceptionControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> productNotFound(ProductNotFoundException exception)
    {
        ProductErrorResponse errorResponse=new ProductErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exception.getMessage());
        errorResponse.setTime(LocalDateTime.now());
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> allException(Exception exception)
    {
        ProductErrorResponse errorResponse=new ProductErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(exception.getMessage());
        errorResponse.setTime(LocalDateTime.now());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
