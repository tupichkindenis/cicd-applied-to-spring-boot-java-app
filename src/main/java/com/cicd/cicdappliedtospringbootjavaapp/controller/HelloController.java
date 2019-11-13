package com.cicd.cicdappliedtospringbootjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/")
    public String home(){
        System.out.println("");
        return "Hello world... (ver 2)";
    }

    @GetMapping ("/good-by")
    public String goodBy(){
        return "Good by...";
    }

}
