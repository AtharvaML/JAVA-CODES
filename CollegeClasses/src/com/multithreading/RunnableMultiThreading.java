package com.multithreading;

class Typing1 implements Runnable{
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

class Spell1 implements Runnable{
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

class Saving1 implements Runnable{
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
public class RunnableMultiThreading {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Typing1());
		Thread t2=new Thread(new Spell1());
		Thread t3=new Thread(new Saving1());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
