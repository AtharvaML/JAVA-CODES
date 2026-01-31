package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorInJava {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(60);
		al.add(70);
		
	     ListIterator  litr=al.listIterator(al.size());
	     
//	     while(litr.hasNext()) {
//	    	 System.out.println(litr.next());
//	     }

	     while(litr.hasPrevious()) {
	    	 System.out.println(litr.previous());
	     }
	}

}

//Accessing using listIterator