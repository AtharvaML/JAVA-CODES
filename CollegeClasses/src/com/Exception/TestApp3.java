package com.Exception;
import java.util.Scanner;

class Testt1{
	void alpha() {
		System.out.println("connection 1 establish");
		
		Testt2 t2=new Testt2();
		t2.beta();
		System.out.println("connection 1 terminated");
	}
}

class Testt2{
	void beta() {
		System.out.println("connection 2 establish");
		
		Testt3 t3=new Testt3();
		try {
		t3.gamma();
		}
		catch(Exception e) {
			System.out.println("hii");
		}
		System.out.println("Connection 2 terminated");
	}
}

class Testt3{
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
public class TestApp3{

	public static void main(String[] args) {
		
		System.out.println("Main connection establish");
		
		Testt1 t1=new Testt1();
		t1.alpha();
		
		System.out.println("main connection terminated");
		

	}

}
