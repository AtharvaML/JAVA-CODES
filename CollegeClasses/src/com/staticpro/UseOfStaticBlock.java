package com.staticpro;

public class UseOfStaticBlock {

	public static void main(String[] args) {
		
		System.out.println("Lekurware");

	}
	
	static {
		System.out.print("Atharva ");
	}

}

// A static block a can be used to initialize a static variable
// Static block can also be used to execute such lines of code which must execute before the main method
// Why is the main method declared as static ?
// Ans- Static method can be directly by using the class name 
// JVM calls the main method to ensure that JVM can called the main method without un-necceary step by creating object so thats why we declared the main method as static if static is not present on main method then the JVM has to create an object


// command line argument given to java program from command
//the command line argument are collected by (runtime) Dynamic array
// Dynamic array of String in the main method


// Explain the main method in java ?
//the main method in java is declared as public so that the JVM can access it from even outside the class 
//the main method is declared as static so that the JVM can access it without creating an object of class
//the main method is declared as void because it doesn't any value to its caller(JVM)
//the main method doesn't return any value to the JVM because the JVM doesn't expect any value to be return also when the control returns to JVM the program has already terminated and hence the point of time there is no sense to expect any value
//the name main is allotted to method
//the main method also accept the string of argument ... this use to accept the command line arguments 


