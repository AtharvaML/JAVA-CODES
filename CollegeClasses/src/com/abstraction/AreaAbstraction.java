package com.abstraction;

abstract class Shape{
	abstract void findArea();
	abstract void dispArea();
	static float pi=3.14f;
	double area;
}

class Circle extends Shape{
	int r;
	public Circle(int r) {
		this.r=r;
		
	}
	@Override
	void findArea() {
		
		area=pi*r*r;
	}

	@Override 
	void dispArea() {
		System.out.println("Area of cirlce"+area);
		
	}
}
class Triangle extends Shape{

	int h;
	int b;
	
	public Triangle(int h,int b) {
		this.h=h;
		this.b=b;
	}
	@Override
	void findArea() {
		
		area=0.5*h*b;
	}

	@Override
	void dispArea() {
		System.out.println("area of triangle="+area);
	}
		
}

class Square extends Shape{

	int r;
     
	public Square(int r) {
		this.r=r;
	}
	@Override
	void findArea() {
		area=r*r;
		
	}

	@Override
	void dispArea() {
		System.out.println("Area of square"+area);
		
	}
	
}
	

class AreaAbstraction {

	public static void main(String[] args) {
		
		disp(new Triangle(3,5));
		disp(new Circle(6));
		disp(new Square(10));
		
	}
	
	static void disp(Shape s) {
		
		s.findArea();
		s.dispArea();
	}

}

// Rule of Inheritance and Abstraction
// We can not instantiate an abstract class 
// An abstract class may or may not have abstract method 
// A child class inheriting from an abstract class must implement the abstract method present in the parent class 
// if a child only partial implement the methods of an abstract class the child class itself should also be declared as abstract
// An abstract class can have all the component which is concrete class can have including instance variables,instance method,instance block,static variable,static method,static block and also Construct

// Can abstract class have main method? Yes
// Can we use the final keyword with an abstract class and abstract method? NO 

// we can have the main method in abstract class 

// the keyword final and abstract are never used together this because final and abstract contradict each other on one hand abstract method must be overridden and final method can not be overridden
// Similarly an abstract often use as parent class where as a class declared as final never be extended
// Such abstract class which contains only abstract method are known as pure abstract class
// if abstract class contains abstract method and concrete method such class known as un-pure abstract class
// 
