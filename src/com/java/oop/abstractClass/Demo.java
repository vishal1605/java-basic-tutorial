package com.java.oop.abstractClass;

public class Demo extends OopAbstraction {
	
	public Demo(String mail) {
		super(mail);
	}
	public static final void myMethod() {
		System.out.println("I am Demo Method");
	}

	public static void main(String[] args) {
		Demo d= new Demo("Vishalgptt@gmail.com"); 
		d.getName("nullme");
		d.myMethod();
		int i = d.myAbstract();
		
		System.out.println(i);
		

	}

	@Override
	protected int myAbstract() {
		int a = 3+3;
		return a;
	}

}
