package com.smag.talkm2.service;

import com.smag.talkm2.models.Student;
import com.smag.talkm2.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(int idEtudiant){
        return studentRepository.findByIdStudent(idEtudiant);
    }

}
