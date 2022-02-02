package com.java.oop.overriding;

public class Test {
	int i = 10;

	protected Number show(int a, int b) throws Exception {
		System.out.println(a / b + " I am parent class");
		return b;
	}

}
