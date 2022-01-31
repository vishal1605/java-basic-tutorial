package com.java.oop.interfaceAbstraction;

abstract interface InterfaceAbstraction {
	int i=10,
	j=5;
	public abstract void m1();
	default String getValue() {
		return null;
		
	}
	static String getString() {
		return "Vishal";
		
	}
	public static void main(String[] args) {
		String string = InterfaceAbstraction.getString();
		System.out.println(string);
		
	}
	
	

}
