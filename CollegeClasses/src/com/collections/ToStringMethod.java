package com.collections;

class Samp{
	private String empname;
	private int empid;
	private String des;
	private float empsal;
	
	Samp(int empid,String empname,String des,float empsal){
		this.empid=empid;
		this.empname=empname;
		this.des=des;
		this.empsal=empsal;
	}
	
	public void setEmpname(String empname){
		this.empname=empname;
	}
	public String getEmpname() {
		return empname;
	}

	public int getEmpid() {
		return empid;
	}

	public String getDes() {
		return des;
	}

	public float getEmpsal() {
		return empsal;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	
	public String toString() {
		return empname+" "+empid+" "+empsal+" "+des;
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		
           Samp s=new Samp(12,"atharva","HR",34.9f);
           
          
           
           System.out.println(s);
	}

}
