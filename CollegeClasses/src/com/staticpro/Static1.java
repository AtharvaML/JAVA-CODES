package com.staticpro;


class StaticDemo{
	
	static int a;
	static int b;
	
	static {
		a=100;
		b=200;
	}
	
	static void disp() {
		System.out.println(a);
		System.out.println(b);
	}
	
	int x;
	int y;
	
	{
		a=300;
		b=400;
		x=500;
		y=600;
	}
	
       void disp2() {
    	System.out.println(a); 
    	System.out.println(b);
    	System.out.println(x);
    	System.out.println(y);
      }
}
public class Static1 {

	public static void main(String[] args) {
		
		StaticDemo.disp();
		
		StaticDemo sd=new StaticDemo();
		
		sd.disp2();
		

	}

}

// a static variable can be access from static memory, static block,static method,instance method,instance block
// instance variable can be accessed from instance method as well as instance block
// instance variable can not be accessed from static method or static block
// instance variable takes place in object


// Flow of static program...

//Operating system will load the JVM to the stack segment
//the class loader will load all the static components including static variables,block,as well as static methods on the static segments
// now static variable will be assign memory as well as default value
// now static block shall be executed
// the JVM calls the main method and rest of the program flow will go as specified as main method 
// Note- an instance block is called after object creation but before constructor called
// static method can be called directly by using class name

// why we cant access instance variable inside a static method and static block ?
