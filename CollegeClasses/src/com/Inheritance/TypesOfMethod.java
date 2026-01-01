package com.Inheritance;

class SecurityForce{
	public void protect() {
		System.out.println("to protect nation");
	}
	public void job() {
		System.out.println("to keep eye on all the forces");
	}
	
}
class Army extends SecurityForce{
	public void useTank() {
		System.out.println("to use tank");
	}
	public void job() {
		System.out.println("to protect land");
	}
	
	
}
class Navy extends SecurityForce{
	public void useShip() {
		System.out.println("to use ship");
	}
	public void job() {
		System.out.println("to protect ocean");
	}
}
class AirForce extends SecurityForce{
	public void useJets() {
		System.out.println("to use jets");
	}
	public void job() {
		System.out.println("to protect air");
	}
	
}
public class TypesOfMethod {

	public static void main(String[] args) {
		
		AirForce a=new AirForce();
		a.protect();
		a.job();

	}

}
		
		// types of methods encounter during inheritance
		// 1)Inherited method 
		// 2)Overriden method/over modified
		// 3)specialized method
