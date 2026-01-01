package com.constructor;

class product1{
	
	int order_id;
	String order_name;
	String order_loc;
	
	public product1() {
		this(101,"lamp","ngp");
		
		System.out.println("0 parametrized constructor is called");
	}
	
	public product1(int order_id) {
		
		System.out.println("1 parametrized constructor is called");
	}
	
	public product1(int order_id,String order_name) {
		this(101);
		
		System.out.println("2 parametrized constructor is called");
	}
	
	public product1(int order_id,String order_name,String order_loc) {
		this(101,"lamp");
		
		System.out.println("3 parametrized constructor is called");
	}
}
public class FlowOfThisMethod {

	public static void main(String[] args) {
		
		product1 p=new product1();
		
	}

}
