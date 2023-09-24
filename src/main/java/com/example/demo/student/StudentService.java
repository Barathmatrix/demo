package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository StudentRepository;
    @Autowired
    public StudentService(com.example.demo.student.StudentRepository studentRepository) {
        StudentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return StudentRepository.findAll();
    }
}
