package com.Exception;

import java.util.Scanner;

class Samp{
	void disp() throws Exception{
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
public class ThrowsKeyword {

	public static void main(String[] args) {
		
		Samp s=new Samp();
		
		System.out.println("connection establish");
		try {
			s.disp();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Connection terminated");

	}

}
