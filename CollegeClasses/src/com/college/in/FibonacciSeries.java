package com.college.in;

class fibo{
	public int check(int a) {

		if(a<=1)
		{
			return a;
		}
		
		
		return check(a-1)+check(a-2);
	}
}
public class FibonacciSeries {

	public static void main(String[] args) {
		
		fibo f=new fibo();
		
	for(int i=0;i<=5;i++) {
			System.out.println(f.check(i));
		
	}

	}

}
