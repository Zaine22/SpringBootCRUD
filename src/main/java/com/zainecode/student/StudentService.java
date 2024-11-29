package com.zainecode.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Kyaw Ko Ko Zin",
                        "Kyawkokozin223@gmail.com",
                        LocalDate.of(2001, Month.JANUARY,8),
                        25)
        );
    }
}
