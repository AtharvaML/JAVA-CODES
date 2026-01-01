package com.Inheritance;

import java.net.SocketTimeoutException;

class Parent1{
	private int a=10;
	int b=10;
	
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Child1 extends Parent1{
	
}
public class Inheritance3 {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		
       System.out.println(c1.a);
		

	}

}

//The private members of a class doesnt participate inheritance
