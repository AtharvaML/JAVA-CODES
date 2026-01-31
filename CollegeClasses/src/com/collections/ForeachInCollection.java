package com.collections;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ForeachInCollection {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(12);
		al.add(23);
		al.add(34);
		al.add(20);

		System.out.println("------------------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("--------For Each--------------");
		
		for(Object x:al) {
			System.out.println(x);
		}
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("dhas");
		a1.add("asjd");
		a1.add("asknd");
		
		for(String s:a1) {
			System.out.println(s);
		}
		
		String[] s1= {"asdsa","sadas","sdasd"};
		
		for(String s:s1) {
			System.out.println(s);
		}
	}

}


//
