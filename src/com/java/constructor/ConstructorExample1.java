package com.java.constructor;

public class ConstructorExample1 implements Runnable {
	
//	try {
	public void add() {
//		Thread.sleep(2000);
		System.out.println(1+2);
	}
//	}catch(Exception e) {
//		e.printStackTrace();
//	}

	public static void main(String[] args) {
		

	}

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

}
