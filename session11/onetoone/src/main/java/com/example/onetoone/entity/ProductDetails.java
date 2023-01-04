package com.example.onetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productdetails")
@Setter
@Getter
@NoArgsConstructor
//@RequiredArgsConstructor
public class ProductDetails {
    @Id
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "description")
    private String productDescription;



    //
    @OneToOne
    @MapsId
    private Product product;
}
