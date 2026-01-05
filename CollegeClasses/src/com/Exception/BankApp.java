package com.Exception;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Bank2 b=new Bank2();
		
		b.banking();
		
		
		
	}

}

class Bank2{
	void banking() {
		ATM2 a=new ATM2();
		a.acceptInfo();
		a.verify();
	}
}

class ATM2{
	int account_no=12345;
	String pass="ath123";
	
	int user_accno;
	String user_pass;
	
	void acceptInfo() {
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your account number");
		user_accno=sc.nextInt();
		System.out.println("Enter your password ");
		user_pass=sc.next();
		
	}
	void verify() {
		if(account_no==user_accno && pass.equals(user_pass)) {
			System.out.println("successfully entered in the account");
		}
		else {
			InvalidInputeException i=new InvalidInputeException();
			System.out.println(i.getMessage());
		}
	}
}

class InvalidInputeException extends Exception{
	public String getMessage() {
		return "Wrong credentials";
	}
	
}