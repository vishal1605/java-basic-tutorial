package com.java.oop.inheritance;

public interface DemoInterface {
	int i = 10;
	
	public DemoInterface getReference();
	public String show();
	public void myMethod();
	
	public static void m2() {
		System.out.println("Demo interface static method");
	}
	
	default void getValue() {
		System.out.println("Demo interface Default method");
	}

}
