package com.polymorphism;

class Trainer{
	void teach(){
		System.out.println("teaches");
	}
}

class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("teches java");
	}
}  

class AppTrainer extends Trainer{
	void teach() {
		System.out.println("teaches app");
	}
}

class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("teaches testing");
	}
}
public class polymorphism1 {

	public static void main(String[] args) {
		Trainer t;
		
		t=new JavaTrainer();
		t.teach();
		t=new AppTrainer();
		t.teach(); 
		t=new TestingTrainer();
		t.teach();
	}

}

// polymorphism is a parading of object oriented programming which enables component of class which behave in multiple ways and exist in multiple form the component refers to variable or a method 
//the biggest advantage of polymorphism is that it provides code flexibility and code reduction 