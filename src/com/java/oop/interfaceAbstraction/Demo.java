package com.java.oop.interfaceAbstraction;

public class Demo implements InterfaceAbstraction {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.getValue(Demo.sirName);
		System.out.println(d.i);
		String string = InterfaceAbstraction.getString(sirName);
		
	
	}

	@Override
	public String m1(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String m1(int name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue(String name) {
		// TODO Auto-generated method stub
		return InterfaceAbstraction.super.getValue(name);
	}

	
	
	
	

	
	

}
