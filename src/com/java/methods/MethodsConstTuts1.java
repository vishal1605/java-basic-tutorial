package com.java.methods;

class Addition{
	int sum;
	public int addNum(int a, int b) {
		sum = a+b;
		return sum;
	}
}

public class MethodsConstTuts1 {

	public static void main(String[] args) {
		Addition add = new Addition();
		int s=add.addNum(4, 3);
		System.out.println(s);

	}

}
