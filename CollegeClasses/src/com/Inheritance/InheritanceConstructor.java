package com.Inheritance;

class Parent2{
	public Parent2() {
		System.out.println("parnet constructor");
	}
}

class Child2 extends Parent2{
	public Child2() {
		System.out.println("Child Constructor");
	}
}
public class InheritanceConstructor {

	public static void main(String[] args) {
		
		Child2 c=new Child2();
		

	}

}

//the constructor of a class also do not participate inheritance however the parent class constructor is called because of constructor chaining 


