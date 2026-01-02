package com.abstraction;

abstract class Bird{
	abstract void eat();
	abstract void fly();
	
}

abstract class Sparrow extends Bird{
	void fly() {
		System.out.println("sparrow is flying");
	}
}

class VegSparrow extends Sparrow{
	void eat() {
		System.out.println("veg sparrow eat grains");
	}
}

class NonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("Nonveg sparrow eat worms");
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		
		duty(new VegSparrow());
		duty(new NonVegSparrow());

	}

	static void duty(Bird b) {
		b.fly();
		b.eat();
	}
}
