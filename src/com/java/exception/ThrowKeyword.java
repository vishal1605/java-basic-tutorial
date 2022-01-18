package com.java.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThrowKeyword {

	void checkNum(int i) throws Exception {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		for (int a : list) {
			if (i == a) {
				throw new Exception("This number is already available");
			} else {
				list.add(i);
//				System.out.println(a);
			}
		}

	}

	public static void main(String[] args) {
		ThrowKeyword tk = new ThrowKeyword();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int j = sc.nextInt();
		try {
			tk.checkNum(j);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
