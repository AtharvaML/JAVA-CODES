package com.abstraction;

abstract class Shivani{
	abstract void protect();
}

class Atharva extends Shivani{
	
	void protect() {
		System.out.println("shivani protects atharva");
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		
		Atharva a=new Atharva();
		a.protect();

	}

}

// In the above example it is certain the protect method of Shivani force class Shall always be overridden by the child classes hence there is no need of the method in the Shivani(parent)
// but if we try to remove the method from the parent class the corresponding methods present in the child class we become specialized as a parent reference can not access the specialized method of the child class 
// so that we will not able to archive the benefit of polymorphism to overcome this problem we use abstraction such methods which have only signatures and not the body are known as incomplete method or abstarct method
// to declare the abstract method we must use abstract keyword
// in java if a class has even a single abstract method the class itself must be declared as abstract 
// the biggest advantage of having abstract methods is that 1)there is no body hence less memory is occupied 2) the corresponding methods in the child class remains overridden hence the benefits of polymorphism is archive  