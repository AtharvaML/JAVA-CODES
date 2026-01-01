package com.college.in;

public class StringConcatMethod {

	public static void main(String[] args) {
		String s1="Md ";
		String s2= "Arsh";
		String s3=s1.concat(s2);
		String s4="Md Arsh";
		if(s3==s4) {
			System.out.println("is equal");
		}
		else {
			System.out.println("not equal");
		}

		if(s3.equals(s4)) {
			System.out.println("is equal");
		}
		else {
			System.out.println("equal");
		}

	}

}

// when we concat to string the resulutant string will get the memory in the non constant pool
