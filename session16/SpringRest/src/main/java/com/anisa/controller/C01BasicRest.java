package com.anisa.controller;

import com.anisa.entity.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class C01BasicRest {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper=new ObjectMapper();
        Product product = objectMapper.readValue(new File("product.json"), Product.class);
        System.out.println(product);
    }
}
