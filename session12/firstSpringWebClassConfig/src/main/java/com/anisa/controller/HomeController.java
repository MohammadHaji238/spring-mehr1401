/*
package com.anisa.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

*/
/*@Component
@RequestMapping("/home")*//*

@Controller("/home")
public class HomeController {

   // @RequestMapping(value = "/a",method = RequestMethod.GET)
    @GetMapping("/a")
    public String showHomePage()
    {
        //model
        //calling service
        return "home";
    }

}
*/
