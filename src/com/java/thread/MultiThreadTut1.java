package com.java.thread;

public class MultiThreadTut1 implements Runnable {
	

	
	public static void main(String[] args){
		
//		System.out.println(Thread.currentThread());
		Thread th = new Thread(new MultiThreadTut1(),"LawdaLahsan");
//		System.out.println(th.isAlive());
//		th.setName("Lawda");    
		th.setDaemon(true);         //Note: in Daemon thread if you are not doing and work in main Thread/ Parent Thread
		th.start();                 //so child thread Also not working means not providing any services
		

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		
	}

}
