package com.java.methods;

public class MethodOverload {

	public static void main(String[] args) {
		sum(10);
		sum("Vishal");
		char s = sum('M');
		System.out.println(s);

	}
	
	public static void sum(int a) {
		System.out.println(a);
	}
	
	public static void sum(String b) {
		System.out.println(b);
	}
	
	public static char sum(char c) {
		return c;
	}
	

}
