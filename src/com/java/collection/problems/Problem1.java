package com.java.collection.problems;

import java.util.Arrays;
import java.util.List;


//Find Max and Min number in Array

public class Problem1 {
	
	static List<Integer> list = Arrays.asList(7, 9, 1, 3, 2, 5, 6, 8, 4);
	
	public static int getMinNumber(List<Integer> newList) {
		int min = newList.get(0);
		for(int i=0; i<newList.size(); i++) {
			if(min> newList.get(i)) {
				min = newList.get(i);
				
			}
		}
		return min;
	}
	
	public static int getMaxNumber(List<Integer> newList) {
		int max = 0;
		for(int i=0; i<newList.size(); i++) {
			if(max< newList.get(i)) {
				max = newList.get(i);
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(getMinNumber(list));
		System.out.println(getMaxNumber(list));
		
	}

}
