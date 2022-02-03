package com.java.oop.inheritance;

public class InheritanceStarter extends TestInheritance {
	
//	Access pointview
//	Note:--As you can see in this example you cant access private members and methods from Parent class
//	even with the reference of Parent(TestInheritance) class
	
//	Overriding pointview
//	You cant override private,final static type Methods
//	and you cant override any type of data members

	public InheritanceStarter(int id) {
		super(id);
		
	}
	
	
	

	@Override
	public int show(int value) {
		// TODO Auto-generated method stub
		return super.show(value);
	}



	public static void main(String[] args) {
		InheritanceStarter is = new InheritanceStarter(10);
		System.out.println(is.age);
		System.out.println(is.show());
		System.out.println(is.show(null));
		System.out.println(is.show(is.name));
		System.out.println();

	}

}
