package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(100,45);
		hm.put(101,5);
		hm.put(13,45);
		
		hm.put(145,95);
		hm.put(134,50);
		hm.put(156,89);
		hm.put(167,67);
		
		System.out.println(hm);
		
	   Set s=hm.keySet();
	   
	   Iterator it=s.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
		
	   System.out.println("----------------");
	   
	   Collection c=hm.values();
	   
	   Iterator it1=c.iterator();
	   while(it1.hasNext()) {
		   System.out.println(it1.next());
	   }
	   
	}

}
