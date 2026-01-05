package com.Exception;

import java.util.Scanner;

class Test_1{
	void alpha() {
		System.out.println("connection 1 establish");
		
		Test_2 t2=new Test_2();
		t2.beta();
		System.out.println("connection 1 terminated");
	}
}

class Test_2{
	void beta() {
		System.out.println("connection 2 establish");
		
		Test_3 t3=new Test_3();
	
		t3.gamma();
		System.out.println("Connection 2 terminated");
	}
}

class Test_3{
	void gamma() {
		System.out.println("connection 3 establish");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2");
		int b=sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("connection 3 terminated");
	}
}
public class TestApp2{

	public static void main(String[] args) {
		
		System.out.println("Main connection establish");
		
		Test_1 t1=new Test_1();
		t1.alpha();
		
		System.out.println("main connection terminated");
		

	}

}

// We have got three ways ton deal with an exception 
// Handling the an excpetion by using "TRY CATCH" block
// Ducking an Exception by using the throws keyword 
// Re-throwing an exception by using throw Keyword 

// Throws Keyword 
// Is used to Duck an exception 
// if a method is throwing an exception the caller of the method must handle the exception or can duck the exception 
