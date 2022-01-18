package com.java.array;

public class AnonymousArray {
	
	public static void sum(int[][] a) {
		int total = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				total=total+a[i][j];
			}
			System.out.println();
			
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		int[][] i = new int[][]{{5,8},{7,9,4},{4,5,9}};
		AnonymousArray.sum(i);

	}

}
