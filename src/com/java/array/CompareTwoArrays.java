package com.java.array;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,5};
		
		System.out.println(Arrays.equals(a, b)); //the way to compare Two arrays
		System.out.println(a[0]==b[0]);
		

	}

}
