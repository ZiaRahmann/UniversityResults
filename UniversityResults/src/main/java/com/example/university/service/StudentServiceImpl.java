package com.example.university.service;

import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository studentrepo;
	
	
	
	@Override
	public void addUser(Student studentAdd) {
		
		Student student = studentrepo.save(student);
		
	}
	

	@Override
	public Student getUserById(String studentId) {
	
		Optional<Student> student = studentrepo.findById(studentId);
		
		return student;
		
	}


	@Override
	public void viewAllUsers(Student student) {
	
		Student student1 = studentrepo.findAll(student1);
		
	}


	@Override
	public void getUserByName(Student studentName) {
		
	Student student = studentrepo.findbyname(studentName);
		
	}


	
	
	
}
