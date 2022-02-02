package com.java.oop.overloading;

public class StarterOverloading {

	public static int join(Object a) { /* Overloading/Compile-time polymorphism is only care about method name */
		/* neither return type nor one method is static and 2nd is non static */
		System.out.println("Object Method");
		return 0;

	}
	
	
	
	/*
	 * As you can see their are two methods with same name but the argument is
	 * different i.e, they are not showing any error
	 */

//	public void join(String a) {
//		System.out.println("String method");
//								 
//	}
	
	public void join(int a) {
		System.out.println("int method");
								 
	}

	public static void main(String[] args) {
		StarterOverloading so = new StarterOverloading();
		so.join(null);
		so.join(5);

	}

}
