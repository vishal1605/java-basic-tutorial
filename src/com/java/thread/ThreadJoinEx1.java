package com.java.thread;

public class ThreadJoinEx1 extends Thread {
	
	public void run() {
		try {
			for(int i= 1; i<=5; i++) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadJoinEx1 tj = new ThreadJoinEx1();
		tj.start();
		tj.join();
		try {
			for(int i= 1; i<=5; i++) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
