package com.gopibhoyar.springboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
	@GetMapping
	public List<Student> getStudent() {
		return List.of(new Student(1L, "Gopi", "gopibhoyar@gmail.com", LocalDate.of(1998,Month.SEPTEMBER , 5), 21));
	}
}
