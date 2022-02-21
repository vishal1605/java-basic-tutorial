package com.java.thread;

public class ManageSeat {
	
	public static void main(String[] args) {
		BookTheaterSeat bts = new BookTheaterSeat();
		Customer1 vishal = new Customer1(bts, 20);
		vishal.setName("Vishal");
		vishal.start();
		
		Customer2 sahil = new Customer2(bts, 20);
		sahil.setName("Sahil");
		sahil.start();
		
		BookTheaterSeat bts1 = new BookTheaterSeat();
		Customer1 nitesh = new Customer1(bts1, 20);
		nitesh.setName("Nitesh");
		nitesh.start();
		
		Customer2 amit = new Customer2(bts1, 20);
		amit.setName("Amit");
		amit.start();
	}

}
