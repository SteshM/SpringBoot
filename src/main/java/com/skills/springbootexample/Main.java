package com.skills.springbootexample;

import com.skills.springbootexample.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	@GetMapping("/")
	public List<Student> hello(){
	     return  List.of(
				 new Student(
						 1L,
		                 "Stesh",
		                 "stesh@gmail.com ",
						 LocalDate.of( 2001, Month.JANUARY, 15),
						 22
				 )
		 );
	}

}
