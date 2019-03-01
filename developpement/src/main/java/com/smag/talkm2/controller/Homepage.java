package com.smag.talkm2.controller;


import com.smag.talkm2.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homepage {
    @RequestMapping ("/")
    private String index(Model model){
        return "index.xhtml";
    }

    @RequestMapping ("/sign_in")
    private String signIn(Model model){
        return "workspace/forms/sign_in.xhtml";
    }

    @RequestMapping ("/login")
    private String login(Model model){
        return "workspace/forms/login.xhtml";
    }


}
