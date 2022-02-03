package com.java.oop.inheritance;

public class DemoInheritance implements TestInterface, DemoInterface{

	public static void main(String[] args) {
		DemoInheritance d = new DemoInheritance();
		

	}

	@Override
	public DemoInterface getReference() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getValue() {
		// TODO Auto-generated method stub
		TestInterface.super.getValue();
		DemoInterface.super.getValue();
	}

	
}
