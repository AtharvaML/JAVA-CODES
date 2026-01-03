package com.polymorphism;

class Parents1{
	static void disp() {
		System.out.println("this is parent method");
	}
}
class Childs1 extends Parents1{
	static void disp() {
		System.out.println("this is child");
	}
	
}
public class MethodHidding {

	public static void main(String[] args) {
		
		Parents1 p=new Parents1();
		p.disp();
		
		Childs1 c=new Childs1();
		c.disp();
		
		Parents1 p1=new Childs1();
		p1.disp();

	}

}

// For Method hiding to exist static method must be present 
// Method resolution is decided by compiler during compilation time based upon the type of class
// Method hiding is also known as compile time polymorphism or early binding