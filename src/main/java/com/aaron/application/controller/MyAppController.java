package com.aaron.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAppController {
    @GetMapping("index")
    public String index(){
        return "index";
    }
}
