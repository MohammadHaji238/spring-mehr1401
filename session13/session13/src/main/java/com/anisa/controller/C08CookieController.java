package com.anisa.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class C08CookieController {

    @GetMapping("/getCookie")
    public String cookie(@CookieValue(value = "JSESSIONID",defaultValue = "123") String jsessionId)
    {
        System.out.println(jsessionId);
        return "product";
    }
    @GetMapping("/setCookie")
    public String setCookie(HttpServletResponse response)
    {
        Cookie cookie=new Cookie("dd","ddddd");
        response.addCookie(cookie);
        return "product";
    }
}
