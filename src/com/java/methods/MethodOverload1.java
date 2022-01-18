package com.java.methods;

public class MethodOverload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getSum(int a, int b) {
		return (a+b);
	}
	
//	public double getSum(int a, int b) {  // In overload only return type is not sufficient
//		double sum = a + b + 0.0;         // to valid method you have take different type of 
//		return sum;                       // Parameter or Number of parameter or different data type parameter
//	}

}
