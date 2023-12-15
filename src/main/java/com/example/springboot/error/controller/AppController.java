package com.example.springboot.error.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/index")
    public String index(){
        // Integer value = 100/0;
        Integer value = Integer.parseInt("10xxaaas");
        return "index";
    }
}
