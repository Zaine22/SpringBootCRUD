package com.zainecode;

import com.zainecode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}

	@GetMapping
	public List<Student> sayHello(){
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
