package com.college.in;

public class MutableString {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());
		sb.append(" Lekurware");
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("bbaskbd asjkdsbda sdjdbh djdbas");
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer(10);
		System.out.println(sb1.capacity());
		
		
		sb.ensureCapacity(51);
		
		System.out.println(sb.capacity());
		
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.append("ronaldo");
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		

	}

}

// initial capacity of stringbuffer is 16..... however the capacity excceded we can use formula if we want to increase the capacity so it uses formula 16*2+2
// Although the default initial capacity of stringbuffer and stringbuilder is 16 but we as a programmer can define(set) our own initial capacity
// ensureCapacity increases the capacity
// trimToSize it trim the size of the string by deleting the remaining space of string
// StringBuffer - is Slow in execution, it is Synchronized, It is thread safe, IT does not multiThreading
// StringBuilder- It is Fast in execution, It is un-Synchronized, It is not thread safe,It does multiThreading