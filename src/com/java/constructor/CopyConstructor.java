package com.java.constructor;

public class CopyConstructor {
	
	String name;
	int i;
	
	CopyConstructor(String myName, int myId){
		this.i = myId;
		this.name = myName;
		
	}
	CopyConstructor(CopyConstructor c){
		System.out.println("CopyConstructor");
		
	}
	

	public static void main(String[] args) {
		CopyConstructor c = new CopyConstructor("Vishal", 105);
		CopyConstructor c1 = new CopyConstructor(c);
		/// Not working copy constructor
		

	}

}
