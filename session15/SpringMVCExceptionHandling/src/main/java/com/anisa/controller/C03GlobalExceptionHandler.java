/*
package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class C03GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String NullPointerException(NullPointerException exception, Model model)
    {
        model.addAttribute("exception",exception);
        return "error3";
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exception(Exception exception)
    {

        return "Exception generated in controller :"+exception;
    }

    @GetMapping("/two")
    public void createError()
    {
        throw new NullPointerException("khali bod 2");
    }
    @GetMapping("/4")
    public void createError2() throws Exception {
        throw new Exception("exception jadid 2");
    }

}
*/
