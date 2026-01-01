package com.encapsulation;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter amount to deposit");
		Bank b=new Bank();
		int bal=sc.nextInt();
		b.setBalance(bal);
		System.out.println("Your current balance : "+b.getBalance());
		System.out.println("please enter amount to widraw");
		int w=sc.nextInt();
		int upd_bal=b.getBalance()-w;
		b.setBalance(upd_bal);
		System.out.println("Your current balance : "+b.getBalance());
	}
}
class Bank{
  private int balance;
  public void setBalance(int bal) {
	  if(bal>0) {
		  balance=bal;  
	  }
	  else {
		  System.out.println("invalid input");
	  }
  }
  public int getBalance() {
	  return balance;
  }
}