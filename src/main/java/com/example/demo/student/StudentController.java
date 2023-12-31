package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService StudentService;
    @Autowired
    public StudentController(StudentService StudentService){
        this.StudentService = StudentService;
    }

  	@GetMapping
	public List<Student> getStudent(){
		return StudentService.getStudent();
	}

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        StudentService.addNewStudent(student);
    }
}
