package com.smag.talkm2.repositories;

import com.smag.talkm2.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Student findByIdStudent(int idEtudiant);
}
