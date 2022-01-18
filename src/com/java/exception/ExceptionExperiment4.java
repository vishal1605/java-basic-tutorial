package com.java.exception;

public class ExceptionExperiment4 {
	
	public void divide() throws InterruptedException {
		
		Thread.sleep(1000);
		throw new InterruptedException();
	
	}

	public static void main(String[] args) {
		ExceptionExperiment4 e1 = new ExceptionExperiment4();
		
		try {
			e1.divide();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Hello");
		

	}

}
