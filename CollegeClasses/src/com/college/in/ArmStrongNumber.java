package com.college.in;


public class ArmStrongNumber {

	public static void main(String[] args) {
	
		int n=153;
		int e=n;
		int sum=0;
		while(n!=0)
		{
			int x=n%10;
			sum=sum+(x*x*x);
			n=n/10;
		}
		
		System.out.println(sum);
		
		if(sum==e) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}
	}

}
