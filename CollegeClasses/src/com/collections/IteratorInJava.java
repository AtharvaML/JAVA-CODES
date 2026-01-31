package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(60);
		al.add(70);
		
	     Iterator  itr=al.iterator();
	     
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }

	}

}

  
