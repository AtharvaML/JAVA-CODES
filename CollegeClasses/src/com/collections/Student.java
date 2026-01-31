package com.collections;

public class Student {
	
	String name;
	int roll;
	int marks;
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	

}
