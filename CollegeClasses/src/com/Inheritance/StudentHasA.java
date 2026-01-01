package com.Inheritance;



class Bike{
	private String brand;
	private int price;
	private String color;
	
	public Bike(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	
}

class Heart{
	private String job;
	private int weight;
	public Heart(String job, int weight) {
		
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
	
	
}

class Student{
	Heart h=new Heart("bite",5);
	
	void disp(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
	    System.out.println(b.getColor());
	}
}
public class StudentHasA {

	public static void main(String[] args) {
		
      Student s=new Student();
      
      s.disp(null);
	}

}

//
