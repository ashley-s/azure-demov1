package com.example.demov1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demov1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demov1Application.class, args);
    }

}

@RestController
class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}