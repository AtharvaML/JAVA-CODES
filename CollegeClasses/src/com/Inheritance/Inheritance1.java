package com.Inheritance;

class player{
	 String name;
	 int age;
	 int mom;
	 int bestScore;
	 String Country;
	
}

class Football extends player{
	
    int goals;
	int assist;
	
	
}

class Cricket extends player{
	
	 int century;
	 float average;

	
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		

		Football f=new Football();
		
		Cricket c=new Cricket();
		
		System.out.println(f.name);
	}

}

//Inheritance is paradigm of object oriented programming in which a class know as child class acquires the properties and behavior of another class know as parent class
//In java inheritance can be achieve by using extends keyword
//inheritance in java is know as "IS-A" relationship
// Inheritance prompts code re-usability and hence save a lot of software development time
