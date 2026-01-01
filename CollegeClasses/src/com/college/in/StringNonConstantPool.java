package com.college.in;

public class StringNonConstantPool {

	public static void main(String[] args) {
		
		String s1=new String("Atharva");
		String s2= new String("Atharva");
		
		if(s1==s2) {
			System.out.println("is equal");
		}
		else {
			System.out.println("not equal");
		}

		if(s1.equals(s2)) {
			System.out.println("is equal");
		}
		else {
			System.out.println("equal");
		}

	}

}
