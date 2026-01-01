package com.polymorphism;

class Trainer1{
	void teach(){
		System.out.println("teaches");
	}
}

class JavaTrainer1 extends Trainer1{
	void teach() {
		System.out.println("teches java");
	}
}  

class AppTrainer1 extends Trainer1{
	void teach() {
		System.out.println("teaches app");
	}
}

class TestingTrainer1 extends Trainer1{
	void teach() {
		System.out.println("teaches testing");
	}
}

public class RealPolymorphism {

	public static void main(String[] args) {
		
		duty(new JavaTrainer1());
		duty(new AppTrainer1());
		duty(new TestingTrainer1());
	}

	static void duty(Trainer1 t) {
		t.teach();
	}

}

// Access specifier 
