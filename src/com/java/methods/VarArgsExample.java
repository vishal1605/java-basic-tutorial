package com.java.methods;

public class VarArgsExample {

	public static void main(String[] args) {
		VarArgsExample va = new VarArgsExample();
		
		// Pass multiple value
//		va.exp("Vishal");
//		va.exp(null, 5,3,7,9,1);

	}
//	public void exp(String str, int ...a) {
//		System.out.println(a.length);
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//			
//		}
//		
//		System.out.println("==================");
//		
//		for(int i:a) {
//			System.out.println(i);
//		}
//	}
	
	static void var(int... i) {
		System.out.println(i.length);
	}

}
