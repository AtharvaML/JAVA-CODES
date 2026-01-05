package com.Exception;

import java.util.Scanner;

class Test1{
	void alpha() {
		System.out.println("connection 1 establish");
		
		Test2 t2=new Test2();
		t2.beta();
		System.out.println("connection 1 terminated");
	}
}

class Test2{
	void beta() {
		System.out.println("connection 2 establish");
		
		Test3 t3=new Test3();
		try {
		t3.gamma();
		}
		catch(Exception e) {
			System.out.println("hii");
		}
		System.out.println("Connection 2 terminated");
	}
}

class Test3{
	void gamma() {
		System.out.println("connection 3 establish");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection 3 terminated");
	}
}
public class TestApp {

	public static void main(String[] args) {
		
		System.out.println("Main connection establish");
		
		Test1 t1=new Test1();
		t1.alpha();
		
		System.out.println("main connection terminated");
		

	}

}

// In case of multiple method hierarchy the RTS will behave in the following way
// 1) the RTS takes the exception object and goes back to the method which threw the exception 
// 2) if the method has not provided an user define exception handler the RTS will not straight away hand over the exception to the default exception handler but it will propagate the exception object down to the stack error only when none of the method have provided any user define exception handler the the RTS will handover the exception object to the default exception handler
