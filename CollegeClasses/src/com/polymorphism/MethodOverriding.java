package com.polymorphism;

class Parents{
	void disp() {
		System.out.println("this is parent method");
	}
}
class Childs extends Parents{
	void disp() {
		System.out.println("this is child");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Parents p=new Parents();
		p.disp();
		
		Childs c=new Childs();
		c.disp();
		
		Parents p1=new Childs();
		p1.disp();

	}

}

//For method overriding to exist the method must be declared as instance(Non-static)
//Method resolution (Which method to be called) is decide by JVM on the basis of object during runtime 
//Method overriding is also known as runtime polymorphism or late binding or dynamic dispatch or dynamic Binding
