package com.college.in;



class Miss{
	public int check(int arr[]) {
		int n=arr.length;
		
		int a=((n+2)*(n+1))/2;
		System.out.println(a);
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		return a-sum;
	}
}
public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5};
		
		Miss m=new Miss();
		
		System.out.println(m.check(arr));
	}

}
