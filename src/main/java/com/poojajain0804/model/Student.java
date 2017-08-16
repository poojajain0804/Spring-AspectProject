package com.poojajain0804.model;

import java.util.List;

public class Student {
	
	private String name;
	private String courseName;
	private int rollNum;
	private List<String> subjects;
	
	
	public Student() {
		super();
	}
	public Student(String name, String courseName, int rollNum, List<String> subjects) {
		super();
		this.name = name;
		this.courseName = courseName;
		this.rollNum = rollNum;
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	

}
