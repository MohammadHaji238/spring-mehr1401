package com.example.allrelation.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NonNull
    private String name;

    @NonNull
    private BigDecimal price;


    //one to many
    @ManyToOne(fetch = FetchType.LAZY)
    @NonNull
    private Category category;

    //one to one

    @OneToOne(mappedBy = "product" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = true)
    private ProductDetails productDetails;

    //many to many
    @ManyToMany(mappedBy = "products")
    private Set<Order> orders;



}
