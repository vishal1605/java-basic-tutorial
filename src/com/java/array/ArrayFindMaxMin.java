package com.java.array;

public class ArrayFindMaxMin {

	public static void main(String[] args) {
		int[] a = {10,2,1,3,9,7};
		int max=a[0];
		int min;
		
		for (int i = 0; i < a.length; i++) {
			
			if(max<a[i]) {
				max=a[i];
				System.out.println(max);
			}

		}
	}

}
