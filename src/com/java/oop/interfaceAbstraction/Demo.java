package com.java.oop.interfaceAbstraction;

abstract interface Test {
	int i=10,
	j=5;
	void m1();
	default String getValue() {
		return null;
		
	}
	static String getString() {
		return "Vishal";
		
	}
	
	void myMethod(String name);
//	public static void main(String[] args) {
//		String string = InterfaceAbstraction.getString();
//		System.out.println(string);
//		
//	}
	
}

public class Demo implements Test {

	public static void main(String[] args) {
//		InterfaceAbstraction ia = new Demo();
//		ia.m1();
		System.out.println(InterfaceAbstraction.i);

	}

	@Override
	public
	void m1() {
		
	}

	@Override
	public String getValue() {
		return "Sahil";
	}

	@Override
	public void myMethod(String name) {
		
	}
	

}
