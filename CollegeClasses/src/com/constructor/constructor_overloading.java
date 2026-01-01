package com.constructor;




class Employee_1 extends Object{
	
	private int Emp_id;
	private String Name;
	private float Salary;

	
	public Employee_1(int Emp_id, String Name, float Salary) {
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

	public Employee_1() {

}

}
public class constructor_overloading {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		 Employee_1 e= new Employee_1 ();
			
			System.out.println("employee id :"+e.getEmp_id());
			System.out.println("Name :"+e.getName());
			System.out.println("Salary"+e.getSalary());
		
        Employee_1 e1= new Employee_1 (101, "shiv", 42866484);
		
		System.out.println("employee id :"+e1.getEmp_id());
		System.out.println("Name :"+e1.getName());
		System.out.println("Salary"+e1.getSalary());
	


	}

}

//