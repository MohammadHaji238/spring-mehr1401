package com.example.allrelation.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Product product;
}
