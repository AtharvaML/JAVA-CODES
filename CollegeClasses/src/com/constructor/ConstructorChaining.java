package com.constructor;

class product{
	
	private int order_id;
	private String order_name;
	private String order_loc;
	
	public product(int order_id,String order_name,String order_loc) {
		
		super();
		
		this.order_id=order_id;
		this.order_name=order_name;
		this.order_loc=order_loc;
	}
	
	public product() {
		this(101,"laptop","ngp");
	}
	
	public int getId() {
		return order_id;
	}
	
	public String getName() {
		return order_name;
	}
	
	public String getLoc() {
		return order_loc;
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		
		product p=new product();
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getLoc());

		
	}

}

// super method is always the first line of constructor regardless of whether programmer has explicitly return it or not
// super method takes the control to the constructor of the direct parent class this is also known as constructor chaining
// in the other words constructor chaining is the process of calling the constructor of the direct parent class by using super method in only one case the programmer has explicitly return or called with this method super will not be the first line of the constructor 
// this method can be used to called the constructor of the class ..... this process of calling constructor form another constructor of the same class by using this method is also know as local chaining
// both this method as well as super have to be first line of a constructor hence inside a constructor  we can either call this or super method