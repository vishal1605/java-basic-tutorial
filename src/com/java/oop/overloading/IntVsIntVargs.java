package com.java.oop.overloading;

public class IntVsIntVargs {
	void show(int a) {
		System.out.println("Integer method");
	}
	
	void show(int... a) {
		System.out.println("Integer Vargs method");
	}
	
	void show(String... a) {
		System.out.println("String Vargs method");
	}

	public static void main(String[] args) {
		IntVsIntVargs iv = new IntVsIntVargs();
		/*iv.show("args");   //This call String vargs method
//		iv.show(args);    //This call String vargs method
//		iv.show("Vishal","Sahil", "Nitesh");   //This call String vargs method
//		iv.show(null,null,null);   //This call String vargs method
*/		
//		This is show you compile-time error But "args" as you can see
//		upword is not showing any error
//		iv.show(Vishal); 
		
		
//		This is Int
		iv.show(2);
		
		
//		This is Vargs Int
		iv.show(2,3,4,5,6);

	}

}
