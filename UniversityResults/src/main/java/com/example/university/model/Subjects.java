package com.example.university.model;

public class Subjects {

	public String telugu;
	
	public String hindi;
	
	public String english;
	
	public String mathematics;
	
	public String physics;
	
	public String chemistry;

	
	public Subjects() {
		super();
	}

	public Subjects(String telugu, String hindi, String english, String mathematics, String physics, String chemistry) {
		super();
		this.telugu = telugu;
		this.hindi = hindi;
		this.english = english;
		this.mathematics = mathematics;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	public String getTelegu() {
		return telugu;
	}

	public void setTelegu(String telegu) {
		this.telugu = telegu;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMathematics() {
		return mathematics;
	}

	public void setMathematics(String mathematics) {
		this.mathematics = mathematics;
	}

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

//	@Override
//	public String toString() {
//		return "Subjects [telegu=" + telegu + ", hindi=" + hindi + ", english=" + english + ", mathematics="
//				+ mathematics + ", physics=" + physics + ", chemistry=" + chemistry + "]";
//	}
	
	
}
