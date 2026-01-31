package com.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSamp {

	public static void main(String[] args) {
		TreeSet v=new TreeSet();
		v.add(50);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		
//	Enumeration	el=v.elements();
//
//	while(el.hasMoreElements()) {
//		System.out.println(el.nextElement());
//	}
//	for(int i=0;i<v.size();i++) { we cant use for loop
//		System.out.println(v.);
//	}
//	
	for(Object x:v) {
		System.out.println(x);
	}
	Iterator it=v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
//	ListIterator lit=v.listIterator(v.size());
//	while(lit.hasPrevious()) {
//		System.out.println(lit.previous());
//	}
	Iterator dit=v.descendingIterator(); 
	while(dit.hasNext()) {
		System.out.println(dit.next());
	}

	}

}
