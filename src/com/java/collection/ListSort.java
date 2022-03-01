package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 9, 1, 3, 2, 5, 6, 8, 4);

		List<Integer> copy1 = new ArrayList<>();
		List<Integer> copy2 = new ArrayList<>();
		List<Integer> original = new ArrayList<>();

		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			if (j < list.get(i)) {
				System.out.println(list.get(i)+" ==If");
				copy1.add(list.get(i));
				j = list.get(i);

			} else {
				System.out.println(list.get(i));
				copy2.add(list.get(i));
				j = list.get(i);

			}
		}
		System.out.println(copy1);
		System.out.println(copy2);

	}

}
