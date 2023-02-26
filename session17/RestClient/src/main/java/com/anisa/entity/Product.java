package com.anisa.entity;

import lombok.*;


import java.math.BigDecimal;


@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private BigDecimal price;
}
