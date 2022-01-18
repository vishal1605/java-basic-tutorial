package com.java.array;

public class CloningArray {

	public static void main(String[] args) {
		int[][] a = {{1,3,9},{5,2,7}};
		int[][] b = a.clone();
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println(a==b);  // It will give false valueas o/p
		System.out.println(a[0][0]==b[0][0]);  // It will give true valueas o/p

	}

}
