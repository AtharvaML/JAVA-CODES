package com.polymorphism;

class Tendulkar{
	void job() {
		System.out.println("to play cricket");
	}
	void profession() {
		System.out.println("he is batsman");
	}
}
class ArjunTendu extends Tendulkar{
	void profession() {
		System.out.println("he is bowler");
	}
	
	void smoke() {
		System.out.println("he somkes");
	}
}
public class LimitationPoly {

	public static void main(String[] args) {
		Tendulkar t=new ArjunTendu();
		
		t.job();
		t.profession();
		((ArjunTendu)t).smoke();

	}

}

//Limitation of parent type reference 
// parent class can not use child methods or specialized method
// Using a parent type reference we are able to access the inherited method as well as overridden method present in the child class but the limitation of parent type reference is that by using we cannot access the specialized method present in the child class
//however if we want to access the specialized method of the child class using parent type reference we must perform a down casting 
// Down casting refers to the process of converting the parent type reference into the child type 
// Down casting valid only for single statement
