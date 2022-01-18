package com.java.thread;

class TicketEarning extends Thread{
	int totalAmount=0;
	public void run() {
		for(int i=1; i<=10; i++) {
			totalAmount +=100;
			
			
		}
		
	}
}
public class EarningMoney {

	public static void main(String[] args) {
		TicketEarning te = new TicketEarning();
		te.start();
		try {
			te.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Thread.sleep(1000);
		System.out.println(te.totalAmount+"rs");

	}

}
