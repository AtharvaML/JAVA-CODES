package com.Exception;

import java.util.Scanner;

class ATM{
	void transaction() throws Exception{
		System.out.println("connection ATM establish");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2");
		try {
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			throw(e);
		}
		
		System.out.println("connection 3 terminated");
	}
}

class Bank{
	void banking() {
		System.out.println("connection BANK establish");
		ATM card=new ATM();
		try {
		card.transaction();
		}
		catch(Exception e) {
			System.out.println("It will be handled");
		}
		System.out.println("connection Bank terminated");
		
	}
}
public class ThrowException {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.banking();
		

	}

}
