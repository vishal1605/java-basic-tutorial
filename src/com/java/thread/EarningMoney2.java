package com.java.thread;

class TicketEarning2 extends Thread{
	int totalAmount=0;
	public void run() {
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				totalAmount +=100;	
				
			}
			this.notify();
			
		}
		
	}
}

public class EarningMoney2 {

	public static void main(String[] args) throws InterruptedException {
		TicketEarning2 te = new TicketEarning2();
		te.start();
		synchronized (te) {
			te.wait();
			System.out.println(te.totalAmount+"Rs");
			
		}

	}

}
