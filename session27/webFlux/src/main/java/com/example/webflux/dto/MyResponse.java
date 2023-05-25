package com.example.webflux.dto;

import lombok.*;

import java.util.Date;
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class MyResponse {
    private Date date=new Date();
    @NonNull
    private int output;
}
