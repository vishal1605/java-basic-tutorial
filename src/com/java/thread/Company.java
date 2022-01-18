package com.java.thread;

public class Company {
	
	int n;
	boolean f=false;
	synchronized void produce(int n) throws InterruptedException {
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("Produce Item: "+this.n);
		Thread.sleep(1000);
		f=true;
		notify();
		
	}
	
	synchronized int consume() throws InterruptedException {
		if(!f) {
			wait();
		}
		System.out.println("Consume item: "+this.n);
		System.out.println("--------------------------------------");
		Thread.sleep(1000);
		f=false;
		notify();
		
		return this.n;
		
	}

}
