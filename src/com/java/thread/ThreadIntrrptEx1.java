package com.java.thread;

public class ThreadIntrrptEx1 extends Thread {
	
	public void run() {
		
			System.out.println("Interruption is Testing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Testing is over");
		
	}

	public static void main(String[] args) {
		ThreadIntrrptEx1 ti = new ThreadIntrrptEx1();
		ti.start();
		ti.interrupt();
		

	}

}
