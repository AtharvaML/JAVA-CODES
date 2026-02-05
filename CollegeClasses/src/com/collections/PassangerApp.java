package com.collections;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;

public class PassangerApp {

	public static void main(String[] args) {
		
		PassangerDetails p=new PassangerDetails(1000, "Atharva", "Nagpur", "Pune", "Train");
		PassangerDetails p1=new PassangerDetails(1003, "Arshad", "Nagpur", "Goa", "Car");
		PassangerDetails p2=new PassangerDetails(1004, "rukhma", "Goa", "Pune", "Bike");
		PassangerDetails p3=new PassangerDetails(1001, "Ali", "Nagpur", "Mumbai", "Plane");
		ArrayList al=new ArrayList();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
			System.out.println(al);
		
		//Collections.sort(al);
		
		System.out.println(al);

	}

}
