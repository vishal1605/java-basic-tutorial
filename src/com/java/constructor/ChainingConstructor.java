package com.java.constructor;

public class ChainingConstructor {
	String name;
	int id;
	
	ChainingConstructor(String myName, int myId){
		this.name = myName;
		this.id = myId;
		System.out.println(name+" :"+id);
	}
	
	ChainingConstructor(int j){
		this("Vishal", 104);
		System.out.println(j);
	}
	
	ChainingConstructor(){
		this(12);
		System.out.println("First Constrouctor");
	}
	

	public static void main(String[] args) {
		
		new ChainingConstructor();
		// TODO Auto-generated method stub

	}

}
