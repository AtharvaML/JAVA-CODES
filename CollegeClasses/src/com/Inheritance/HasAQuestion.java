package com.Inheritance;

class Heart1{
	private String job;
	private int weight;
	public Heart1(String job, int weight) {
		super();
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

class Brain{
	private String job;
	private int weight;
	public Brain(String job, int weight) {
		super();
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

class Bike1{
	private int speed;
	private String brand;
	public Bike1(int speed, String brand) {
		super();
		this.speed = speed;
		this.brand = brand;
	}
	public int getSpeed() {
		return speed;
	}
	public String getBrand() {
		return brand;
	}
}

class Book1{
	private String name;
	private int price;
	public Book1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class Student1{
	Heart1 h1=new Heart1("bit",6);
	Brain c=new Brain("smart",3);
	
	void disp(Bike1 b1) {
		System.out.println(b1.getSpeed());
		System.out.println(b1.getBrand());
	}
	
	void disp1(Book1 b) {
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}
	
}
public class HasAQuestion {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		

	}

}
