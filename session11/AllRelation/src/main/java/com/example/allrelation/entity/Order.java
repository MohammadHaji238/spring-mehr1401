package com.example.allrelation.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "order")
@Table(name = "orders")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "order_number")
    @NonNull
    private int orderNumber;

    @ManyToMany(targetEntity = Product.class/*,cascade = CascadeType.ALL*/)
    @JoinTable(name = "order_product",
            inverseJoinColumns = {@JoinColumn(name = "product_id")},
             joinColumns= {@JoinColumn(name = "order_id")}
    )
    private Set<Product> products;
}
