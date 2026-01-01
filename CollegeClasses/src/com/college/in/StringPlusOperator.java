package com.college.in;

public class StringPlusOperator {

	public static void main(String[] args) {
		String s1="Atharva"+" Lekurware";
		String s2= "Atharva Lekurware";
		
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
			System.out.println("not equal");
		}

	}

}

// + operator can also be used concat the two String
// when we use the + operator along with String references the resultant String will get memory on the non constant pool(NCP).
//however if we use + operator with raw String the resultant String will get memory on the Constant pool(CP)