package com.java.oop.interfaceAbstraction;

interface InterfaceAbstraction {
	final String sirName = "Gupta";
	int i=10,
	j=5;
	int[] ages = new int[5];
	
	String m1(String name);
	String m1(int name);
	
	default String getValue(String name) {
		name="Sahil";
		String myName= "Vishal";
		name = myName;
		return name;
		
	}

	/*
	 * default String getValue(int sum) { return null;
	 * 
	 * }
	 */
	static String getString(String name) {
		String myName= "Vishal";
		name = myName;
		return name;
		
	}
	private static String getString(String name, int age) {
		return "Vishal";
		
	}

	/*
	 * static {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		String string = InterfaceAbstraction.getString("Sahil");
		System.out.println(string+" "+InterfaceAbstraction.sirName);
		
		
	}
//	private static abstract interface Test{        //interface uses static, public, 
//		
//	}
//	
//	public static final class Demo{
//		
//	}
	
	

}
