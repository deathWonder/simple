package com.example.simplesecuritygit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Authorized by Github";
    }
}
