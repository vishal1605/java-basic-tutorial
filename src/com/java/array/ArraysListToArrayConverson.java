package com.java.array;

import java.util.ArrayList;

public class ArraysListToArrayConverson {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(9);
		
		Object[] array = list.toArray();
		
		Integer[] a = new Integer[list.size()];  //for convert Object[] to Integer[]
		list.toArray(a);      
		
		Object[] obj = list.toArray();
		int[] j = new int[obj.length];
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
