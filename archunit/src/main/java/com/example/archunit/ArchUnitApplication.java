package com.example.archunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchUnitApplication {

    public static void main(String[] args) {
        System.out.println("Arch started");
        SpringApplication.run(ArchUnitApplication.class, args);
    }

}
