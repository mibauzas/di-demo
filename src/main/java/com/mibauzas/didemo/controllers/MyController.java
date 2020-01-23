package com.mibauzas.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by mbs on 01/22/20
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello world!!");

        return "foo";
    }
}