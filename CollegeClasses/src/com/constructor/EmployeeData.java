package com.constructor;

import java.util.Scanner;

class Employee{
	
	private int id;
	private String name;
	private int salary;
	
	public Employee(int i,String n,int s) {
		id=i;
		name=n;
		salary=s;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}
public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		int i=sc.nextInt();
		System.out.println("enter your name");
		String n=sc.next();
		System.out.println("enter your salary");
		int s=sc.nextInt();
		
		Employee e=new Employee(i,n,s);
		
		System.out.println("Your id is="+e.getId());
		System.out.println("Your Name is="+e.getName());
		System.out.println("Your salary is="+e.getSalary());

	}

}

// it is a specialized setter method