package com.smag.talkm2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {
    @GetMapping("/")
    private String index(){
        return "index.html";
    }

}
