package com.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueSamp {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		
		System.out.println(pq);
		
//		Enumeration	el=v.elements();
//	
//		while(el.hasMoreElements()) {
//			System.out.println(el.nextElement());
//		}
//		for(int i=0;i<pq.size();i++) { 
//			System.out.println(pq.get(i));
//		}
		
		for(Object x:pq) {
			System.out.println(x);
		}
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		ListIterator lit=pq.listIterator(pq.size());
//		while(lit.hasPrevious()) {
//			System.out.println(lit.previous());
//		}
//		Iterator dit=pq.descendingIterator(); 
//		while(dit.hasNext()) {
//			System.out.println(dit.next());
//		}
		

	}

}
