package com.anisa.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;

    //private LocalDate expDate;
}
