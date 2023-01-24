package com.anisa.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/") //path match
public class C05paramsController {



   @GetMapping(value = "testParam/{id}"/*,params = "myParam"*/,headers = "user-agent")
  public String testParam(@PathVariable(value = "id") String id,@RequestParam("myParam") String myParam)
  {
      return "product";
  }
}
