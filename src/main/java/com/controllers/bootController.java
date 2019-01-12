package com.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bootController {

    @RequestMapping("/hello")
    public String testController() {
        return "Hello test boot controller";
    }


}
