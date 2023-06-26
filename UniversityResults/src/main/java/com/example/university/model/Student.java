package com.example.university.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "Student")
public class Student {

	
	@Id
	public String studentId;
	
	public String studentName;
	
	public String totalScore;
	
	public Subjects subject;

	
	public Student() {
		super();
	}

	public Student(String studentId, String studentName, String totalScore, Subjects subject) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.totalScore = totalScore;
		this.subject = subject;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	
	
	
}
