package com.value;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	@Value("${Student.name}")
	private String name;
	@Value("${Student.interestedCourse}")
	private String intrestedCourses;
	@Value("${Student.hobby}")
	private String hobby;
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getIntrestedCourses() {
		return intrestedCourses;
	}
	
	public void setIntrestedCourses(String intrestedCourses) {
		this.intrestedCourses = intrestedCourses;
	}
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayInfo()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student intrestedCourses:"+intrestedCourses);
		System.out.println("Student hobby:"+hobby);
	}
	
}
