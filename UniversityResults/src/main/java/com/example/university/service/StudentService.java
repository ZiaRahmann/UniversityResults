package com.example.university.service;

public interface StudentService {

	
	public void addUser(Student studentAdd);
	
	public void viewAllUsers(Student student);
	
	public Student getUserById(String studentId);
	
	public void getUserByName(Student studentName);
	
}
