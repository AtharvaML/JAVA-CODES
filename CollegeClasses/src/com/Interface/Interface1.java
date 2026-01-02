package com.Interface;

public interface Interface1 {

	void add();
	void sub();
}

//Interface
//
//They are service required specification(srs) it is use to help to achieving the standardization of code 
//1) one or multiple classes can implement from an interface by using the keyword implements 
//2) if a class implements an interface the class must provide body for all the abstract methods of the interface 
//3) By default the method of an interface are public as well abstract(whether the programmer explicitly mention or not)
//4) A single interface can be implemented by multiple classes while implementing the methods the child classes must insure that the same method signature is followed as present in the parent interface however different classes may implement the methods in there own way for example 
//5) An interface type reference can be used to refer to implementing class object however this parent type reference can refer to only the overridden methods in the implementing class 
//6) However if we want access the specialized methods of implementing class by using the parent interface reference we must perform down casting(explicit Typecasting )  
//7) An interface can be empty which is known as marker interface or tagged interface
//8) A single class can implement multiple interface with respective to classes is not permitted in java However we can achieve multiple inheritance in java indirectly by using interfaces 
//9) An interface can not implement another interface however an interface can extend to another interface 
//By default the variable declared inside an interface are public, final, static and also the methods are public and abstract 
// if a class extend to another class as well as implement from another interface the class must extends first and then implement 

// abstract class Samp extends Object implements Interface1,Interface2{
//  }

// If a class is only partially implement an interface a class itself declared as abstract
// we cannot create an object of an interface or we cannot instantiate it However we can create a reference of an interface this is done so that by using parent interface type reference we are able to access child class object and hence polymorphism is archived 

