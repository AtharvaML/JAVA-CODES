package com.college.in;

public class StringCompareTo {

	public static void main(String[] args) {
		String s1="SACHIN";
		String s2="SAURAV";
		
		String s3="VIRAT";
		String s4="VIRU";
		
		int res=s1.compareTo(s2);
		int res1=s3.compareTo(s4);
		System.out.println(res);
		System.out.println(res1);
		
		if(res>0) {
			System.out.println("s1 is greater");
		}else if(res<0) {
			System.out.println("s2 is greater");
		}
		else {
			System.out.println("both are equal");
		}

	}

}


//char a='U';
//int b=a;
//System.out.println(b);

//the CompareTo() method compares to String char by char it would return positive value if the first String is greater it is going to return negative value if the Second string is greater
//It will return zero if both the string are equal
//it compares character based on there unicode value
