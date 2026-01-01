package com.encapsulation;

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String gender;
	
public void setData(String n,int a,String g) {
	name=n;
	age=a;
	gender=g;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getGender() {
	return gender;
}	
	
	
}
public class StudentData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String s=sc.next();
		System.out.println("enter your age");
		int a=sc.nextInt();
		System.out.println("enter your gender");
		String g=sc.next();
		
	    Student s1=new Student();
	    s1.setData(s,a,g);
	    System.out.println("your name is:"+s1.getName());
	   
	    System.out.println("your name is:"+s1.getAge());
	    
	    System.out.println("your name is:"+s1.getGender());
		

	}

}

//encapsulation is concept of object oriented programming system which enables us to provide security to the important data member of a class 
//in encapsulation for providing security to the important data members we declares the data member as private 
//the private member of class is accessible from with in the same class so private prevent complete access but encapsulation is not prevent complete access rather it provides controlled 
//controlled access is provided by using public setter and public getter. this setter and getter must contain validation code in order to provide complete access  
//since setter and getter are public it can be access from outside the class also this setter and getter method with the same class as the private member
