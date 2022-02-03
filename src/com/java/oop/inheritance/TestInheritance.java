package com.java.oop.inheritance;

public class TestInheritance {
	private static int id = 321;
	static int age = 25;
	private final int salary = 12800;
	final String name = "Vishal";
	String sirName = "Gupta";
	
	
	public TestInheritance(int id) {
		System.out.println(id);
	}
	
	private void privateMethod(int salary) {
		salary=this.salary;
		System.out.println(salary);
	}
	
	public static String show() {
		return "Vishal";
	}
	
	public final String show(String name) {
		name = "final static method";
		return name;
	}
	
	public int show(int value) {
		
		return value;
	}
	
	
	

}
