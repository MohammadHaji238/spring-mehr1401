package com.example.webflux.service;

public class Util {

    public static void sleepSecond(int second)
    {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
