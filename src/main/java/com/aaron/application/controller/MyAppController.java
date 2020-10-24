package com.aaron.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAppController {
    @GetMapping(value = {"index.html","index"})
    public String index(){
        return "index";
    }
    @GetMapping("about.html")
    public String about(){
        return "about";
    }
    @GetMapping("contact.html")
    public String contact(){
        return "contact";
    }
    @GetMapping("services.html")
    public String services(){
        return "services";
    }
    @GetMapping("single.html")
    public String single(){
        return "single";
    }
}
