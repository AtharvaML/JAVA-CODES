package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrder {


	public static void main(String[] args) {
		
   ArrayList al=new ArrayList();
   al.add(45);
   al.add(34);
   al.add(60);
   al.add(90);
   al.add(100);
   
   Comparator c=Collections.reverseOrder();
   Collections.sort(al, c);
   System.out.println(al);	
   }

}
