package com.java.thread;

class ProduceAndConsume{
	synchronized void produce() {
		for(int i=1; i<=10; i++) {
			System.out.println("Product produce: "+i);
			try {
				Thread.sleep(2500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try{wait();}catch(Exception e) {e.printStackTrace();}
			notify();
		}
	}
	
	synchronized void consume() {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Product consume: "+i);
			try {
				Thread.sleep(2500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			notify();
			try{wait();}catch(Exception e) {e.printStackTrace();}
			
		}
	}
}
public class PCThreadGfgDemo {

	public static void main(String[] args) {
		ProduceAndConsume pc = new ProduceAndConsume();
		new Thread() {
			public void run() {
				pc.produce();
			}
			
		}.start();
		
		new Thread() {
			public void run() {
				pc.consume();
			}
			
		}.start();
		

	}

}
