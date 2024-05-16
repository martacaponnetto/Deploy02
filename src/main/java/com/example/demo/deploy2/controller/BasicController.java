package com.example.demo.deploy2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v2")
public class BasicController {
    @GetMapping("/sum")
    public int sumTwoNumbers(){
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(3);
       return num1 + num2;
    }
}
