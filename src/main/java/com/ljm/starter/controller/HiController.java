package com.ljm.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping("hi")
public class HiController {


    @GetMapping
    public String sayHi(){
        System.out.println("This is hi");
        return "Hi!";
    }
}
