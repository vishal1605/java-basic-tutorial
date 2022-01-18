package com.java.thread;

class TestEx extends Thread{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
	
}

public class GfgDemo1 {

	public static void main(String[] args) {
		
		TestEx t = new TestEx();
		t.start();
		

	}

}
