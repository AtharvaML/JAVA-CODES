package com.staticpro;

class Triangle{
	
	static float half=0.5f;
	int h;
	int b;
	
	public Triangle(int b,int h) {
		
		this.b=b;
		this.h=h;
	}
	
	float disp() {
		
		float area=half*b*h;
		
		return area;
	}
}
public class TriangleArea {

	public static void main(String[] args) {
		
		Triangle t=new Triangle(5,10);
		
		System.out.println(t.disp());

	}

}
