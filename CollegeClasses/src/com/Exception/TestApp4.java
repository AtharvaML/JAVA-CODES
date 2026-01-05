package com.Exception;

import java.util.Scanner;

class Testt_1{
	void alpha() {
		System.out.println("connection 1 establish");
		
		Testt_2 t2=new Testt_2();
		try {
		t2.beta();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("connection 1 terminated");
	}
}

class Testt_2{
	void beta() {
		System.out.println("connection 2 establish");
		
		Testt_3 t3=new Testt_3();
		t3.gamma();
		System.out.println("Connection 2 terminated");
	}
}

class Testt_3{
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
public class TestApp4{

	public static void main(String[] args) {
		
		System.out.println("Main connection establish");
		
		Testt_1 t1=new Testt_1();
		t1.alpha();
		
		System.out.println("main connection terminated");
		

	}

}
