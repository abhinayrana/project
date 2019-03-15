package com.controller.j;


import java.sql.Date;
import java.util.ArrayList;


public class Student {

	
	String name;
	String hobby;
	Long mobile;
	Date dob;
	//ArrayList<Student> skills;
	
	
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
//	public ArrayList<Student> getSkills() {
//		return skills;
//	}
//	public void setSkills(ArrayList<Student> skills) {
//		this.skills = skills;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
