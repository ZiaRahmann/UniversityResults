package com.example.university.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studentrepo;
	
	@Autowired
	StudentServiceImpl studentservice;
	
	
	@PostMapping(value="/add")
	public Student createUser(Student studentId) {
		
		Student stu1 = studentservice.createUser(Student);
		return studentId;
	}
	
	@GetMapping(value ="/getuserbyid")
	public Student getUserById(Student studentId) {
		
		return studentId;
	}
	
	@GetMapping(value ="/viewall")
	public Student viewAllUsers(Student student)  {
		
		return student;
	}
	
	@GetMapping(value ="/getuserbyname")
	public Student getUserByName(Student studentName) {
		
		return studentName;
	}
	
	
	
	
}
