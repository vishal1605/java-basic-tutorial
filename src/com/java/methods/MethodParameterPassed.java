package com.java.methods;

public class MethodParameterPassed {
	public static void swap(Integer i, Integer j) {
	      Integer temp = new Integer(50);
	      System.out.println(temp);
	      i = j;
	      j = temp;
	      System.out.println(temp);
	      
	   }

	public static void main(String[] args) {
		Integer i = new Integer(10);
	      Integer j = new Integer(20);
	      swap(i, j);
	      System.out.println("i = " + i + ", j = " + j);
	   }

	}


