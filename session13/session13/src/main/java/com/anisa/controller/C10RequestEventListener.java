package com.anisa.controller;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class C10RequestEventListener {


    @EventListener
    public void request(RequestHandledEvent event)
    {
        System.out.println(event.toString());
    }
}
