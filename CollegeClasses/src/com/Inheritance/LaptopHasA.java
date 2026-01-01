package com.Inheritance;


class Charger{
	private String brand;
	private int power;
	
	public Charger(String brand,int power) {
		this.brand=brand;
		this.power=power;
	}

	public String getBrand() {
		return brand;
	}

	public int getPower() {
		return power;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPower(int power) {
		this.power = power;
	}
   
	
}
class laptop{
	Os os=new Os("atha",34);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());
	}
}
class Os{
	
	private String brand;
	private int version;
	public Os(String brand, int version) {
		super();
		this.brand = brand;
		this.version = version;
	}
	public String getBrand() {
		return brand;
	}
	public int getVersion() {
		return version;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}

public class LaptopHasA {

	public static void main(String[] args) {
		

	}

}
