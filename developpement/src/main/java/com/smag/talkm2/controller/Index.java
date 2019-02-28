package com.smag.talkm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class Index {

    @GetMapping("/")
    private String index(){
        return "Hello";
    }
}
