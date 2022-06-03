package com.java.problems.practice.ReferenceVariable;

public class Reference1 {
	int x = 5;
	int y = 10;
	
	public void getValue(Reference1 R1) {
//		R1.x=30;
		System.out.println("X = "+R1.x);
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}

	public static void main(String[] args) {
		Reference1 r=new Reference1();
		Reference1 r2=new Reference1();
		r.getValue(r);
		r.x=20;
		r.getValue(r2);

	}

}
