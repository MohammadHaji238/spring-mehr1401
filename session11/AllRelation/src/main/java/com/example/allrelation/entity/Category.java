package com.example.allrelation.entity;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
@Entity(name = "category")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "category_seq")
    @SequenceGenerator(name = "category_seq",allocationSize = 10)
    private Long id;
    @NonNull
    private String name;




    @OneToMany(mappedBy = "category",orphanRemoval = true,cascade = CascadeType.ALL)
    private Set<Product> products=new HashSet<>();






}
