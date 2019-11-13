package com.cicd.cicdappliedtospringbootjavaapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    void home() {
        assertThat(helloController.home()).isEqualToIgnoringCase("Hello world... (ver 2)");
    }
}