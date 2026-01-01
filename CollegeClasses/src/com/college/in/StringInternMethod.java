package com.college.in;

public class StringInternMethod {

	public static void main(String[] args) {
		String s1=new String("deep");
		String s2=s1.intern();
		String s3=s1.intern();
		
		if(s2==s3) {
			System.out.println("is equal");
		}
		else {
			System.out.println("not equal");
		}
        
	}

}

// the intern takes a copy of string present non constant pool(NCP) and moves it to the constant pool(cp) 
