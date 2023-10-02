package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = StudentRepository.findStudentByEmail(student.getEmail());
        System.out.println(studentByEmail);
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        StudentRepository.save(student);
        System.out.println(student);
    }
}
