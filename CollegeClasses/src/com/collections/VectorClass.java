package com.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		
	Enumeration	el=v.elements();

	while(el.hasMoreElements()) {
		System.out.println(el.nextElement());
	}
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
	
	for(Object x:v) {
		System.out.println(x);
	}
	Iterator it=v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ListIterator lit=v.listIterator(v.size());
	while(lit.hasPrevious()) {
		System.out.println(lit.previous());
	}
	//Iterator dit=v.descendeningIteraor();  Not applicable
	}
}
