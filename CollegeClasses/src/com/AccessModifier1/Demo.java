package com.AccessModifier1;

import com.AccessModifier.DemoClass;

public class Demo {
	
	DemoClass d=new DemoClass();
	
      void disp3() {
    	  System.out.println(d.a);
//  		System.out.println(d.b);
//  		System.out.println(d.c);
//  		System.out.println(d.d);
  		
      }

}

class Demo1 extends DemoClass {
	
	void disp4() {
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
	}
	
}

// we have 4 access modifier
// public member of a class are accessible throughout the same package as well in different packeage
// Protected member of a class are accessible with in the same package as well as in a child class of different package
// Default member of class are only accessible with in the same package
// private member of a class are accessible only with in the same class

