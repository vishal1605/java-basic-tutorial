package com.java.oop.overriding;

public class StarterOverriding extends Test {
	int i=5;
	@Override
	public void show(int a, int b) {
		try {
			super.show(100, super.i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a+b+" I am Child class");
	}

	public static void main(String[] args) {
		Test t = new Test();
		StarterOverriding so = new StarterOverriding();
		so.show(5, 7);
		

	}

}
