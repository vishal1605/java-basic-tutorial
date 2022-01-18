package com.java.thread;

public class MultThreadYieldTut implements Runnable {
	
	@Override
	public void run() {
//		Thread.yield();
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
		
	}

	public static void main(String[] args) {
		MultThreadYieldTut yt = new MultThreadYieldTut();
		Thread th = new Thread(yt);
		th.setName("Thread-11");
		th.start();
		th.yield();
		
		MultThreadYieldTut yt1 = new MultThreadYieldTut();
		Thread th1 = new Thread(yt1);
		th.setName("Thread-12");
		th1.start();
		
		
		
//		Thread.yield();
//		for(int i=1; i<=5; i++) {
//			System.out.println(Thread.currentThread().getName()+" :"+i);
//		}
		
		

	}

}
