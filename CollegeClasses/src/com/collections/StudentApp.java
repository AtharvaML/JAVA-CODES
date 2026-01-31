package com.collections;

public class StudentApp {
	
	public static void main(String[] args) {
		
		Student s=new Student("atharva", 15, 80);
		Student s1=new Student("ayush",14,70);
		Student s2=new Student("shivani",12,90);
		
		Student[] arr= { s,s1,s2};
		
		for(Student s4:arr) {
			System.out.println(s4.getName());
			System.out.println(s4.getRoll());
			System.out.println(s4.getMarks());
		}
		

	}

}

//Accessing element in Collection class using for loop OR Enhance for-loop
