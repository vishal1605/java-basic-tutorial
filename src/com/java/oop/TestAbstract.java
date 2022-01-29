package com.java.oop;

abstract class A {
	abstract void m1(A a);

	final void myMethod() {
		System.out.println("I am class A method");

	}
	A(int i){
		System.out.println("I am class A constructor");
	}
}

class B extends A {
	 B(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	protected void m1(A a) {  //Cant use static keyword And private modifier
		System.out.println("One");
	}
}

class C extends B {
	C(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	void m1(B b) {
		System.out.println("Two");
		super.m1(new B(10));
	}
//	void myMethod() {
//		super.myMethod();
//		System.out.println("I am class C method");
//
//	}
}

public class TestAbstract {

	public static void main(String[] args) {
		C c = new C(5);
		c.myMethod();
		c.m1(c);

	}

}
