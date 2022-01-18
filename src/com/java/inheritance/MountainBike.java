package com.java.inheritance;

public class MountainBike extends Bike {
	
	public int seatHeight;

	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
		
	}
	
	public void setHeight(int value) {
		seatHeight=value;
	}
	
	

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(4, 87, 21);
		System.out.println(mb.toString());

	}

}
