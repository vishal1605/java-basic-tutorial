package com.java.oop.inheritance;

public interface TestInterface {
	
	public String show();
	public void m1();
	
	public static void m2() {
		System.out.println("Test interface static method");
	}
	
	default void getValue() {
		System.out.println("Test interface Default method");
	}

}
