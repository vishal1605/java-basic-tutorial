package com.java.collection;

import java.util.Arrays;

public class CustomList {
	int size = 5;
	int[] data  = new int[size];
	
	
	public void add(int num) {
		for(int i = 0;i<data.length;i++) {
			data[i] = num;
		}
	}
	

	


	@Override
	public String toString() {
		return "CustomList [size=" + size + ", data=" + Arrays.toString(data) + "]";
	}


	public static void main(String[] args) {
		
		CustomList c = new CustomList();
		c.add(5);
		System.out.println(c);

	}

}
