package com.Inheritance;

class Heart2{
	private String job;
	private int weight;
	public Heart2(String job, int weight) {
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

class Brain2{
	private String job;
	private int weight;
	public Brain2(String job, int weight) {
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

class Bike2{
	private int speed;
	private String brand;
	public Bike2(int speed, String brand) {
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

class Book2{
	private String name;
	private int price;
	public Book2(String name, int price) {
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

class Human{
	Heart2 h2=new Heart2("bit",6);
	Brain2 b2=new Brain2("smart",4);
	
}
class Students extends Human{
	void disp(Bike2 b2) {
		System.out.println(b2.getBrand());
		System.out.println(b2.getSpeed());
	}
	
	void disp1(Book2 b1) {
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
	}
}
public class HasAInheritance {

	public static void main(String[] args) {
		
		Students s1=new Students();
		
		System.out.println(s1.h2.getJob());
		System.out.println(s1.h2.getWeight());
		System.out.println(s1.b2.getWeight());
		

	}

}
