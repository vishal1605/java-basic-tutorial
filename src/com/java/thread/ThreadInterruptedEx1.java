package com.java.thread;

public class ThreadInterruptedEx1 extends Thread {
	
	public void run() {
//		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());  // isInterrupted() is only show status in boolean form
		try {
			for(int i= 1; i<=5; i++) {
				System.out.println("Child Thread: "+i);
				System.out.println(Thread.interrupted());    //interrupted() is not show only status of interruption
				Thread.sleep(1000);                          // as well as it changes the status carry on
                                                          //  further execution
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThreadInterruptedEx1 ti = new ThreadInterruptedEx1();
		ti.start();
		ti.interrupt();

	}

}
