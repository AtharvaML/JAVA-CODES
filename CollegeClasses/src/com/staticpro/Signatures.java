package com.staticpro;

public class Signatures {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		Signatures.main(20);

	}
	
	public static void main(int a) {
		a=10;
		System.out.println(a);
		
	}

}

//The Different signature allowed for main method 
// 1)public static void main(String... args)
// 2)public static void main(String[] args)
// 3)public static void main(String args[])
// 4)static public void main(String[] args)
// 5)final synchronized public static void main(String... args)

// Can we overload the main method in java ?
// Yes we can overload the main method in java but JVM is going to call only such main method which accept a string array of argument.


