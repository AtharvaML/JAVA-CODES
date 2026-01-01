package com.Inheritance;

class ParentA{
	void disp() {
		System.out.println("hiii");
	}
}
class ChildA extends ParentA{
	protected void disp() {
		System.out.println("jaa");
	}
//	int disp() {
//		System.out.println("jaj");
//		return 0;
//	}
}
public class ParentApp {

	public static void main(String[] args) {
		
           ChildA c=new ChildA();
           c.disp();
	}

}

//Rules of inheritance
//While Overriding a method in the child class we must use an access specifier provides the same visibility or more visibility 
// while overriding the return type of the method in child class must be same as the corresponding method in parent
// the overridden method in the child class have a different return type as compare parent method 
// provided that the return type share IS-A  is also know as co-variant return type

// in the real world along with IS-A relationship there also exist HAS-A relationship 
// HAS-A relationship can be of two type  1)Aggregation    2) Compassion
// Aggr-in this object is not completely dependent upon the main object hence if we destroy the main object the aggregate object will still exist
// Compossion- in this the object is completely dependent upon the enclosing or the main object hence if the main object is destroyed the composite object will also be destroyed