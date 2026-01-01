package com.Inheritance;


class Parent5{
	int a;
	int b;
	public Parent5(){
		this(99,99);
		a=10;
		b=20;
		System.out.println("2");
	}
	public Parent5(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("1");
	}
}
class Child5 extends Parent5{
	
	public Child5(){
		a=30;
		b=40;
		System.out.println("3");
	}
	public Child5(int a,int b) {
		this();
		this.a=a;
		this.b=b;
		System.out.println("4");
	}
	
}
public class ConstructorBehaviour {

	public static void main(String[] args) {
		
		Child5 c5=new Child5(100,99);
		
		System.out.println(c5.a+" "+c5.b);
		

	}

}
