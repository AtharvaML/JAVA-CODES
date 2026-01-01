package com.Inheritance;


class GrandParent{
	int a=10;
}
class Parent4 extends GrandParent{
	int b=20;
}
class Child4 extends Parent4{
	
}
public class MultiLevelnheritance {

	public static void main(String[] args) {
		
        Child4 c4=new Child4();
        System.out.println(c4.a);
        System.out.println(c4.b);
	}

}

//In java class can extend to only a single class Although multiple inheritance is not allowed in java but we can use multilevel inheritance

