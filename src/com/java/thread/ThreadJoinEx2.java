package com.java.thread;

public class ThreadJoinEx2 extends Thread {
	
	static Thread main;
	
	public void run() {
		try {
			main.join();
			for(int i= 1; i<=5; i++) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		main=Thread.currentThread();
		ThreadJoinEx2 tj = new ThreadJoinEx2();
		tj.start();
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
