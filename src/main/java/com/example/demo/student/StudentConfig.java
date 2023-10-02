package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student barath = new Student("barath", "barath@gmail.com", LocalDate.of(1994, 12,05));
           Student jayanthi = new Student("Jayanthi", "barath11@gmail.com", LocalDate.of(194, 12,05));
           repository.saveAll(List.of(barath, jayanthi));
        };
    }
    
}
