package com.college.in;



public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr= {3,5,2,1,4};
		
		for(int i=0;i<arr.length;i++) {
			int j=i;
			
			while(j>0 && arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
