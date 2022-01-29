package com.java.oop;

public abstract class OopAbstraction{
	int age = 14;
	static String name;
//	private String email;
	String value = "Vishal";
	public String address;
	protected long mNumber = 12345678l;
	final String email;
	int number = 16;
	private final static double salary = 14356.00d;

	public OopAbstraction(String mail) {
		this.email = mail;
		System.out.println(mail);

	}

	protected static final void getName(String name) {
		System.out.println(name);
		System.out.println("Hello Abstraction");
	}

	protected abstract int myAbstract();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		getName("abstract");

	}

	public abstract class Test {

	}

	public abstract class Test2 {

	}

}
