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
           Student barath = new Student("barath", "barath@gmail.com", LocalDate.of(1994, 12,05),28);
           Student jayanthi = new Student("Jayanthi", "barath@gmail.com", LocalDate.of(1994, 12,05),28);
           repository.saveAll(List.of(barath, jayanthi));
        };
    }

    
}
