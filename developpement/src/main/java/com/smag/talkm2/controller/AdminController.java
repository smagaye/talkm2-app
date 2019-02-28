package com.smag.talkm2.controller;

import com.smag.talkm2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class AdminController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    private ResponseEntity index(){
        return new ResponseEntity(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    private ResponseEntity findOneStudent(@PathVariable("id") int idEtudiant){
        return new ResponseEntity(studentService.findById(idEtudiant), HttpStatus.OK);
    }
}
