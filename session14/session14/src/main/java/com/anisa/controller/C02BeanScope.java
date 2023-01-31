package com.anisa.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@RequestScope
//@SessionScope
//@ApplicationScope
//@Scope("singleton")
//@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class C02BeanScope {
}
