package com.java.collection.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Sort array
public class Problem2 {

	static List<Integer> list = Arrays.asList(9, 2, 3, 1);

	// Sort in Ascending order
	public static List<Integer> getAscOrder(List<Integer> newList) {

		for (int i = 0; i < newList.size(); i++) {
			for (int j = i + 1; j < newList.size(); j++) {
				if (newList.get(i) > newList.get(j)) {

					int temp = newList.get(j);
					newList.set(j, newList.get(i));
					newList.set(i, temp);
				}

			}
		}
		return newList;
	}

	// Sort in Descending order
	public static List<Integer> getDecOrder(List<Integer> newList) {

		for (int i = 0; i < newList.size(); i++) {
			for (int j = i + 1; j < newList.size(); j++) {
				if (newList.get(i) < newList.get(j)) {

					int temp = newList.get(j);
					newList.set(j, newList.get(i));
					newList.set(i, temp);
				}

			}
		}
		return newList;
	}

	public static void main(String[] args) {

		List<Integer> ascOrder = getAscOrder(list);
		System.out.println(ascOrder);
		List<Integer> decOrder = getDecOrder(list);
		System.out.println(decOrder);

	}
}
