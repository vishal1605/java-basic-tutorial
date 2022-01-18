package com.java.constructor;

public class Demo {
	
	String name;
	long id;
	
	
//	public Demo(String myName, long myId) {
//		System.out.println(myName+" :"+myId);
//		
//		
//	}
	
	Demo(String myName, long myId){
		this.name=myName;
		this.id=myId;
	}
	

	public static void main(String[] args) {
		Demo d = new Demo("Vishal", 103l);
		System.out.println(d.name+" :"+d.id);
		

	}

}
