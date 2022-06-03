package com.java.problems.practice.ReferenceVariable;

class Demo{
	int x = 10;
	int y = 20;
	int display(Demo A, Demo B) {
		A.x = 50;
		
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Y = "+B.y);
		return 0;
	}
}
public class Reference {

	public static void main(String[] args) {
		Demo C = new Demo();
		Demo D = new Demo();
		
//		Demo A = C;
		D.y = 80;
		
		C.display(C, D);
//		D.display(C, D);
		
//		C.x = 75;
//		System.out.println("X = "+A.x);
//		System.out.println("Y = "+C.y);
//		System.out.println("X = "+D.x);
//		System.out.println("Y = "+D.y);
		

	}

}
