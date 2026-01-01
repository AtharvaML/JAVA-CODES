package com.constructor;

import java.util.Scanner;

class Emp{
	
	private int id;
	private String name;
	private int salary;
	
	public Emp(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
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
public class ShadowingProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		int i=sc.nextInt();
		System.out.println("enter your name");
		String n=sc.next();
		System.out.println("enter your salary");
		int s=sc.nextInt();
		
		Emp e=new Emp(i,n,s);
		
		System.out.println("Your id is="+e.getId());
		System.out.println("Your Name is="+e.getName());
		System.out.println("Your salary is="+e.getSalary());

	}
	
//every constructor has super method on his first Line.		
// super calls parent class constructor.
	}

// shadowing problem and Solution
// according to industry standard the name of the local variable inside a setter method must be same as the name of instance 
// variable .
//but when we do this the modification of values is not reflected in the instance variable.
//this is because the JVM is not able to differentiate between the local variable and the instance variable 
//as a results all the modifications are basically happening on the local variable themselves  
// that the appear that local variable are the shadowing the instance variable and hence the able problem is shadowing problem.//