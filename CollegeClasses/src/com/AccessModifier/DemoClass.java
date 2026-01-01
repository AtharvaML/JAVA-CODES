package com.AccessModifier;


public class DemoClass {

	public int a;
	protected int b;
	int c;
	private int d;
	public static void main(String[] args) {
		DemoClass d=new DemoClass();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		
	}

}

class Demo1{
	DemoClass d=new DemoClass();
	void disp() {
	System.out.println(d.a);
	System.out.println(d.b);
	System.out.println(d.c);
	//System.out.println(d.d);
	}
}

class Demo2 extends DemoClass{
	void disp1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
		
	}
}
