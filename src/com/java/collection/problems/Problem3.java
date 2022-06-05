package com.java.collection.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(8, 5, 9, 2, 3, 6));
		List<Integer> list1 = new ArrayList<>(list);
		List<Integer> list2 = new ArrayList<>();

		int min = list.get(0);
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				if (min > list.get(j)) {
					min = list.get(j);
					list.remove(list.indexOf(min));
					
				}
				
			}
			System.out.println(min);
			

		}
		
//		System.out.println(min);
		System.out.println(list1);
		

	}

}
