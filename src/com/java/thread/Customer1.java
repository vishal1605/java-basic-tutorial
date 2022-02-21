package com.java.thread;

public class Customer1 extends Thread {
	BookTheaterSeat seatBooking;
	int seat;
	public Customer1(BookTheaterSeat seatBooking, int seat) {
		this.seatBooking = seatBooking;
		this.seat = seat;
	}
	@Override
	public void run() {
		seatBooking.seatBook(seat);
		System.out.println(Thread.currentThread().getName());
	}
	
	
	
	
	

}
