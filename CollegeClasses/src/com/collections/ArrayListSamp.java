package com.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListSamp {

	public static void main(String[] args) {
		ArrayList v=new ArrayList();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		
//	Enumeration	el=v.elements();  Enumeration can not applicable
//
//	while(el.hasMoreElements()) {
//		System.out.println(el.nextElement());
//	}
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
		//v.add(i);
	}
	
	for(Object x:v) {
		System.out.println(x);
		//v.add(x);
	}
	Iterator it=v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		//v.add(it);
	}
	ListIterator lit=v.listIterator(v.size());
	while(lit.hasPrevious()) {
		System.out.println(lit.previous());
	}
	//Iterator dit=v.descendeningIteraor();  Not applicable

	}

}
