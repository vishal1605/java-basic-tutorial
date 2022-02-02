package com.java.oop.overloading;

public class AutoPromotingDataType {

	void show(int a, float b) {
		System.out.println("int-float method");

	}

	void show(float b, int a) {
		System.out.println("float-int method");

	}
	
	void show(String name, float a) {
		System.out.println("String-float method");

	}

	public static void main(String[] args) {
		AutoPromotingDataType ap = new AutoPromotingDataType();
		
//		In this method if you assign both to int value it is not
//		going to promoting int to float and showing compile-time error
		ap.show(10, 10.3f);
		
//		But in this case String-float it promoting int to float
//		you can see ex below
		ap.show("Vishal", 20);
		
		
		ap.show(1.3f, 20);

	}

}
