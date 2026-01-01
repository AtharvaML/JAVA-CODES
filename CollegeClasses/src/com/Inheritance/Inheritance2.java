package com.Inheritance;


class Parent{
	int a=10;
	int b=20;
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Child extends Parent{
	
}
public class Inheritance2 {

	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.disp();
		

	}

}

//if a class extends to another class it will acquire all the property and behaviors of the parent class

