package com.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class hello {
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
