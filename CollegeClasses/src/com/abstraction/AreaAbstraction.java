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



