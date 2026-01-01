package com.college.in;


class Samp1{
	
	public int[] check(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		return arr;
	}

}

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr= {10,30,50,20,40};
		
		Samp1 b=new Samp1();
		
		for(int x:b.check(arr)) {
			System.out.println(x);
		}
	}
}
