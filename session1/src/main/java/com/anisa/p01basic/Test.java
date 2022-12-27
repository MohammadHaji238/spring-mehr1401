package com.anisa.p01basic;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        final IntStream intStream = IntStream.of(1, 2, 3);
        final OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());
    }
}
