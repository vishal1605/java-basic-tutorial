package com.java.constructor;

public class ChainingConstructor2 {
	
	{
		System.out.println("I am just block");
	}
	ChainingConstructor2(){
		System.out.println("First Constructor");
	}
	ChainingConstructor2(int x){
		System.out.println("Second Constructor: "+x);
	}
	

	public static void main(String[] args) {
		ChainingConstructor2 c = new ChainingConstructor2();
		ChainingConstructor2 c1 = new ChainingConstructor2(10);
		

	}

}
