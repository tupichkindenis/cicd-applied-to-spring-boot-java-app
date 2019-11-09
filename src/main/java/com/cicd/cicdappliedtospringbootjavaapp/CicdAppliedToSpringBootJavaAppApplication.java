package com.cicd.cicdappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdAppliedToSpringBootJavaAppApplication {

    @GetMapping("/")
    public String home(){
        return "Hello world...";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
    }

}
