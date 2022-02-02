package com.java.oop.overloading;

public class OverloadStringBufferAndString {

	void myMethod(String a) {
		System.out.println("String method");

	}

	void myMethod(StringBuffer a) {
		System.out.println("StringBuffer method");

	}

	public static void main(String[] args) {
		OverloadStringBufferAndString obj = new OverloadStringBufferAndString();
		
//		Null value give you compile-time error because compiler getting confused 
//		which one you call, because both string and StringBuffer default value is null
//		obj.myMethod(null);
		
		
//		This gonna called String method
		obj.myMethod("Vishal");
		
//		This gonna called StringBuffer method
		obj.myMethod(new StringBuffer("Sahil"));
		
		

	}

}
