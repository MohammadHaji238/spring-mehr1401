package com.example.onetoone.entity;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*@Column(name = "product_name")*/
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;


    @OneToOne(mappedBy = "product" ,cascade = CascadeType.ALL)
    private ProductDetails productDetails;



}
