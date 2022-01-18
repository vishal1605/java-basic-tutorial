package com.java.thread;

import java.util.Scanner;

class Customer{
	int amount=1000;
	synchronized void withdraw(int amount) {
		System.out.println("going for withdraw");
		if(this.amount<amount) {
			System.out.println("Sorry ! you dont have enough balance: "+this.amount);
			System.out.println("Please deposit more amount");
			try{wait();}catch(Exception e) {e.printStackTrace();}
			
			try{Thread.sleep(3000);}catch(Exception e) {e.printStackTrace();}
			this.amount=this.amount-amount;
			System.out.println("amount withdraw successful!: "+this.amount);
		}
	}
	synchronized void deposit(int amount) {
		System.out.println("Amount processing...");
		this.amount=this.amount+amount;
		System.out.println("Amount deposited successfully: "+amount);
		System.out.println("Total amount: "+this.amount);
		
		notify();
	}
	
}

public class GfgDemoEx extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Customer c = new Customer();
		Scanner sc = new Scanner(System.in);
		int cash=sc.nextInt();
		new Thread(){  
			public void run(){c.withdraw(cash);}  
			}.start();  
			int dCash = sc.nextInt();
			new Thread(){  
			public void run(){c.deposit(dCash);}  
			}.start();  
		

	}

}
