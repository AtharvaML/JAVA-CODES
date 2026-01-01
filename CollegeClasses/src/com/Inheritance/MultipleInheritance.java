package com.Inheritance;

class Parents1{
	int a=10;
	public Parents1() {
		System.out.println("aa");
	}
}

class Parents2{
	int b=20;
	public Parents2{
		System.out.println("bb");
	}
}

class Childs3 extends Parents1,Parents2{

	public Childs1() {
		System.out.println("abb");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Childs3 c3=new Childs3();

	}

}

//multiple inheritance is not allowed in the this is because ambiguity issue might arise and diamond shape problem is also exist
