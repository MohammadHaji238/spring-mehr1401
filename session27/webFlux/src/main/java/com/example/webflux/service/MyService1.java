package com.example.webflux.service;

import com.example.webflux.dto.MyResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MyService1 {
    public MyResponse m1(int i)
    {
        return new MyResponse(i*i);
    }

    public List<MyResponse> m2(int i)
    {
        return IntStream.rangeClosed(1,5)
                //foreach
                .peek(value -> Util.sleepSecond(1))
                .peek(value -> System.out.println("processing :"+value) )
                .mapToObj(value -> new MyResponse(i*value))
                .collect(Collectors.toList());
    }
}
