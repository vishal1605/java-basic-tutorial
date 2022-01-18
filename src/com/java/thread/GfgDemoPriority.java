package com.java.thread;

class Demo2 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("i am Child1");
		
	}
}
class Demo3 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("i am Child2");
		
	}
}

public class GfgDemoPriority extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Demo2 d1 = new Demo2();
		d1.setPriority(1);
		d1.start();
		
		Demo3 d2 = new Demo3();
		d2.setPriority(10);
		d2.start();
		
		
		
		

	}

}
