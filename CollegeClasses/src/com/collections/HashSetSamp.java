package com.collections;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetSamp {

	public static void main(String[] args) {
		HashSet v=new HashSet();
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
//	for(int i=0;i<v.size();i++) {
//		System.out.println(v.);
//	}
	
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
//	Iterator dit=v.descendingIterator(); 
//	while(dit.hasNext()) {
//		System.out.println(dit.next());
//	}


	}

}
