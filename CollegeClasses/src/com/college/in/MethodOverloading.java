package com.college.in;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	
	float add(int a,float b) {
		return a+b;
	}
	
	float add(float a,int b) {
		return a+b;
	}
	
	double add(double a,double b,double c) {
		return a+b+c;
	}
	
	double add(int a,float b,double c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,float b,int c) {
		return a+b+c;
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		System.out.println(c.add(30, 23.45f));
				

	}

}

//Any previous method performing same task of addition while calling this method one must remebering the specific method name based on their reqiurment
//the [process of remembering so many name can be hectic to avoid this problem uses the concept of method overloading
//method overloading is a concept in which multiple method of the same class has the same name but warry in their signiture
//the biggest advantages is uding the single name we can perform different operetion 
//a method overloading eazy the usabiltiy of code
// it is compile time polymorphism this is because during the compile time only it is decided which method has to be called since multiple method are having the same name an ambiguity problem 
// arises to overcome this problem the compiler useus the follwing rule
//1 first the compiler is going to match the number of argument 
//2 multiple method with same name and same number of argument the compiler while match the data type of argument
//3 if even after following the above rules if confusion is still there now the compiler will check the order of data type
// note- method overloading has to exist one or more of the above rules must be satisfied 
// method overloading is also known as virtual or false polymorphism
// for true polymorphism one is many relationship should exist but in methodoverloading does not exist but in the above example it appares  that i single add method doing multiple task but
// in reality multiple add method are doing one task each 
// method overloading actuALLY suports one is one relationship hecn it is exmaple of false polymor and not trye
// explore the concept of type permotion
// can we overload method main method