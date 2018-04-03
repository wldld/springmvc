package com.yz.springmvc.controller;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {

    @Autowired
    protected DSLContext dslContext;

    @RequestMapping("/hello")
    public String sayHello(){

        return "hello World!";
    }
}
