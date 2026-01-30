package com.Area;

import java.util.Scanner;

class Samp{
	void square(int a) {
		int b=a*a;
		System.out.println("area of square="+b);
	}
	
	void traingle(int b,int h) {
		float c=(float)(0.5*b*h);
		System.out.println("area of traingle="+c);
	}
	
	void rectangle(int w,int h) {
		int area=w*h;
		System.out.println("area of rectangle="+area);
	}
	
	void circle(int c) {
	float area=(float)3.14*c;
	System.out.println("area of circle="+area);
	}
}
public class Area {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Samp s=new Samp();
		
		System.out.println("Enter your choice");
		
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1:{
			System.out.println("enter the side of square");
			int z=sc.nextInt();
			s.square(z);
			break;
		}
		
		case 2:{
			System.out.println("enter the two side of triangle");
			int z=sc.nextInt();
			int c=sc.nextInt();
			s.traingle(z, c);
			break;
		}
		
		case 3:{
			System.out.println("enter the two side of rectangle");
			int z=sc.nextInt();
			int c=sc.nextInt();
			s.rectangle(z, c);
			break;
		}
		
		case 4:{
			System.out.println("enter the side of circle");
			int z=sc.nextInt();
			s.circle(z);
			break;
		}
		}

	}

}
