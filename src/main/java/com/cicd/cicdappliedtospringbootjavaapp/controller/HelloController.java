package com.cicd.cicdappliedtospringbootjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping ("/")
    public String home(){
        return "Hello world...";
    }

    @GetMapping ("/good-by")
    public String goodBy(){
        return "Good by...";
    }

}
