package com.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOrWriteArray {

	public static void main(String[] args) {
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		
		al.add(50);
		al.add(40);
		al.add(60);
		al.add(70);
		
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(100);
		}

		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
