package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping(value = "/for",method = RequestMethod.GET)
    public String forwardTest(){
        return "Hello";
    }
}
