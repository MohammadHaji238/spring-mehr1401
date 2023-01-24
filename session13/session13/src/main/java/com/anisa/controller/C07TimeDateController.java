package com.anisa.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping("/")
public class C07TimeDateController {

    @GetMapping("/date1")
    public String sendDate(
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @RequestParam("startDate") LocalDateTime startDate,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @RequestParam("endDate")  LocalDateTime endDate)
    {
        System.out.println(startDate);
        System.out.println(endDate);
        return "product";
    }
}
