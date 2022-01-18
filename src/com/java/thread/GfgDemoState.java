package com.java.thread;

class Demo extends Thread {

	public void run() {
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("State of thread1 while it called join() method on thread2 -" + GfgDemoState.d1.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
public class GfgDemoState extends Thread {
	static GfgDemoState d1;

	public static void main(String[] args) {
		d1 = new GfgDemoState();
		System.out.println("State of thread2 after creating it - " + d1.getState());
        d1.start();
          
        // thread1 moved to Runnable state
        System.out.println("State of thread2 after calling .start() method on it - " + 
            d1.getState());

	}
	public void run() {
		Demo d = new Demo();
		System.out.println("Thread state Thread1 after creating - "+d.getState());
		d.start();
		System.out.println("Thread after Thread1 calling status - "+d.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread after Thread1 calling sleep method status - "+d.getState());
		
		try 
        {
            // waiting for thread2 to die
            d.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of Thread1 when it has finished it's execution - " + 
            d.getState());
	}


}
