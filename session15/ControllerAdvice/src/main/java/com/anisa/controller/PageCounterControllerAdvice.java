package com.anisa.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

@ControllerAdvice//global
@SessionScope
//@RequestScope
//1-@ExceptionHandler
// 2- @InitBinder
// 3-@ModelAttribute
public class PageCounterControllerAdvice {

    private ConcurrentHashMap<String , LongAdder> map=new ConcurrentHashMap<>();


    @ModelAttribute
    public void handleRequest(HttpServletRequest request, Model model)
    {
        String requestURI = request.getRequestURI();
        map.computeIfAbsent(requestURI,s -> new LongAdder()).increment();
        model.addAttribute("counter",map.get(requestURI).sum());
        model.addAttribute("uri",requestURI);
    }


}
