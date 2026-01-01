package com.constructor;


class Employeee extends Object{
	
	private int Emp_id;
	private String Name;
	private float Salary;

	
	public Employeee(int Emp_id, String Name, float Salary) {
		super();
		this.Emp_id = Emp_id;
		this.Name = Name;
		this.Salary = Salary;
		
		
	}


	public int getEmp_id() {
		return Emp_id;
	}


	public String getName() {
		return Name;
	}


	public float getSalary() {
		return Salary;
	}


}

public class ObjectClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeee e = new Employeee(101, "shiv", 42866484);
		
		System.out.println("employee id :"+e.getEmp_id());
		System.out.println("Name :"+e.getName());
		System.out.println("Salary"+e.getSalary());
	}
	
	//the parent class of all the classes of java is the object class
	//if a programmer does not explicitly extended to object class the compiler will implicitly do so 
	// the first statement inside the constructor is a called do the super method

	//super method can we called by the programmer or else it will be implicitly added by the compiler
	//super method takes the control to the constructor of the direct parent class 
	//it is the object class constructor which is responsible the to provide default values for implicitly the instance variables child class

}

// in the above program the compiler will look for search a constructor which does not accept any argument but there is no such constructor present in our class and hence
// -we are going to get a compile time error.
//only and only if the programmer has not define a constructor in the class the compile will add 0 parameterized constructor.
//such a constructor which is provided by the compiler when no constructor was provided by the programmer is known as default constructor
