package com.java.thread;

public class Consumer extends Thread {
	
	Company c;
	public Consumer(Company c) {
		this.c=c;
		
	}
	public void run() {
		while(true) {
			try {
				this.c.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
	}

}
