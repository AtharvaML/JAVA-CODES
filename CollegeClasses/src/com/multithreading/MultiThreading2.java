package com.multithreading;

class Typing extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("typing...");
			try {
			Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Spell extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Spell...");
			try {
				Thread.sleep(3000);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
	}
}

class Saving extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("saving...");
			try {
			Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading2 {

	public static void main(String[] args) {
		Typing t=new Typing();
		Spell s1=new Spell();
		Saving s2=new Saving();

		t.start();
		s1.start();
		s2.start();
	}

}
