package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add(100);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(60);
		al.add(70);
		
	     Iterator  itr=al.descendingIterator();
	     
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }

	}

}
