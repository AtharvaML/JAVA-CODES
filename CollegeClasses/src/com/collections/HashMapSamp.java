package com.collections;

import java.util.HashMap;

public class HashMapSamp {

	public static void main(String[] args) {
		
		Samp1 s=new Samp1(101,"atha","student");
		Samp1 s1=new Samp1(102,"rupa","intern");
		Samp1 s2=new Samp1(103,"anis","hr");
		
		HashMap hm=new HashMap();
		
		hm.put(1, s);
		hm.put(2,s1);
		hm.put(3, s2);
		
		System.out.println(hm);

	}

}

class Samp1{
	
	int id;
	String name;
	String des;
	public Samp1(int id, String name, String des) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDes() {
		return des;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Samp1 [id=" + id + ", name=" + name + ", des=" + des + "]";
	}	
		
}
