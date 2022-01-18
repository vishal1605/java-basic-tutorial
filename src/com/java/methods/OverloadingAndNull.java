package com.java.methods;

public class OverloadingAndNull {
	
	public static void fun(Integer i) {
		System.out.println("This is integer ");
	}
//	public void fun(String a) {
//		System.out.println("This is integer ");
//	}

	public static void main(String[] args) {
		OverloadingAndNull on = new OverloadingAndNull();
//		on.fun(null);   //it will give you compile time error
		
//		String i = null;
//		on.fun(i);
		
		fun(5);

	}

}
