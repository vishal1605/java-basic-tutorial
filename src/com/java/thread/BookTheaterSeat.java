package com.java.thread;

public class BookTheaterSeat {
	static int totalSeat = 20;

	static synchronized void seatBook(int seat) {

			if (totalSeat >= seat) {
				totalSeat = totalSeat - seat;
				System.out.println(seat + " Your seat booked successfully");
				System.out.println(totalSeat + " Seat left");
			} else {
				System.out.println("Seat can not be booked");
				System.out.println(totalSeat + " Seat left");
			}

		

	}

}
