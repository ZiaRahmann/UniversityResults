package com.example.university.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@PostMapping(value="/add")
	public String addUser() {
		return "User Created..!!!";
	}
	
	
	
}
