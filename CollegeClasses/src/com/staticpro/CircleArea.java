package com.staticpro;

class Circle{
	int r;
	static float pi=3.14f;
	
	public Circle(int r) {
		this.r=r;
	}
	
	float disp() {
		float area=pi*r*r;
		
		return area;
	}
}
public class CircleArea {

	public static void main(String[] args) {
		
		Circle c=new Circle(10);
		
		System.out.println(c.disp());

	}

}

// Such variables whose value is going to stay the same regardless of object should be declared as static 
// such variables whose value can be different for object can be created as instance
