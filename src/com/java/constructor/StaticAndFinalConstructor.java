package com.java.constructor;

public class StaticAndFinalConstructor {
	
	final int i;
	static final int j=5;
	StaticAndFinalConstructor(){
		
		i=10;
//		j=11;  //Static with final must be declared
	}

	public static void main(String[] args) {
		StaticAndFinalConstructor s = new StaticAndFinalConstructor();
		System.out.println(s.i);
		

	}

}
