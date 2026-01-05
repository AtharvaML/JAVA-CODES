package com.Exception;

public class ParentApp {

	public static void main(String[] args) {
		disp();

	}
	static void disp() {
		System.out.println("hello");
		try {
		disp();
		}catch(Error e) {
			System.out.println("error handled");
		}
	}

}

//Stack overflow Error 