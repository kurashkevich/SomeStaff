package com.example.archunit.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    public static int sum(int a, int b){
        return a+b;
    }
}
