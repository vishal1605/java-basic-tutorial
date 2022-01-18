package com.java.methods;

public class OverloadingAndAmbiguity {
	
	public static void varArgs(int... a) {
		System.out.println("This is Integer");
	}
	
	public static void varArgs(float... b) {
		System.out.println("This is Float");
	}
	
	public static void varArgs(long... c) {
		System.out.println("This is Long");
	}
	
	public static void varArgs(boolean... c) {
		System.out.println("This is Long");
	}

	public static void main(String[] args) {
//		varArgs();  //it always gives first preference to int than long,float
//		varArgs();  // But in case of int and boolean it confused because both are valid candidates

	}

}
