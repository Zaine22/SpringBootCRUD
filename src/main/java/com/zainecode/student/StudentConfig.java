package com.zainecode.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {

            Student Zaine =  new Student(
                    "Kyaw Ko Ko Zin",
                    "Kyawkokozin223@gmail.com",
                    LocalDate.of(2001, Month.JANUARY,8),
                    25);

            Student Alex =  new Student(
                    "Alex Ko Ko Zin",
                    "Alexkokozin223@gmail.com",
                    LocalDate.of(2001, Month.JANUARY,8),
                    25);
            studentRepository.saveAll(
                    List.of(Zaine,Alex)
            );
        };
    }
}
