package com.java.array;

public class ArrayFinalKeyword {

	public static void main(String[] args) {
		final int[] a = {1,3,5};
		final int j=2;
		
		
//		for(int i=0;i<a.length;i++) {
//			a[i]=a[i]*10; 
//			j=j*2;  //it will not change because of final kayword
//			
//			System.out.println(a[i]);
//		}
		
		final int arr1[] = {1, 2, 3, 4, 5};
	       int arr2[] = {10, 20, 30, 40, 50};
	       arr2 = arr1;       
	       for (int i = 0; i < arr2.length; i++) {
	          System.out.println(arr2[i]);          
	    }  

	}

}
