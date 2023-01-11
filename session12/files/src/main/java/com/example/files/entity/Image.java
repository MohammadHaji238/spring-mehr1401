package com.example.files.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Setter
@Getter
public class Image {
    @Id
    private  Long id;
    private  String name;
    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    private  byte[] data;
}
