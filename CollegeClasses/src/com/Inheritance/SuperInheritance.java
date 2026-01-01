package com.Inheritance;

class Base{
	int x=10;
	void disp() {
		System.out.println(x);
	}
}

class Sub extends Base{
	int x=20;
	
	void disp() {
	
		super.disp();
		System.out.println(x);
		
	}
	

}
public class SuperInheritance {

	public static void main(String[] args) {
		Sub s=new Sub();
		s.disp();

	}

}

// The super refers to direct parent class
// if a child class has instance variable whose name is same as an instance variable present in the parent class 
// in a such a case the variable of child class while be given the reference 
//however if we want to access the variable present in the parent class we can use super keyword

// This() method,This Keyword,super() method and super keyword

//Final can be Class,Method,Variable
// when we declare variable as final we will not able to modify it 
// if we declare a method as final we will not able to override the method
// if we declare the class as final we will not able to inherit