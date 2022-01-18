package com.java.inheritance;

public class Bike {
	public int gear;
	public int speed;
	
	public Bike(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBreak(int decrement) {
		speed-=decrement;
	}
	
	public void speedUp(int increment) {
		speed-=increment;
	}

	@Override
	public String toString() {
		return "Bike [No of gears are=" + gear + ", speed of bicycle of=" + speed + "]";
	}
	
	

}
