package com.mibauzas.didemo.controllers;

import com.mibauzas.didemo.services.GreetingService;

import org.springframework.stereotype.Controller;

/**
 * Created by mbs on 01/22/20
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello world!!");

        return greetingService.sayGreeting();
    }
}