package com.example.demo.student;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public Student getStudent(){
        return new Student( 6L,"Barath", "Barath", LocalDate.of(2000,5,5),5);
    }
}
