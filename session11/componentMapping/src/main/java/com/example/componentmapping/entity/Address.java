package com.example.componentmapping.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Embeddable
public class Address {
    private  String street;
    private  String city;
    private  String country;
}
