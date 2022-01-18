package com.java.String;

public class StringStart {

	public static void main(String[] args) {
		String name = "Vishal";
		StringBuffer buffer = new StringBuffer(name);
		StringBuffer r = buffer.reverse();
		System.out.println(name.trim());
		System.out.println(r);
		
//		System.out.println(name.charAt(0));
//		System.out.println(name.substring(0, 5));
//		System.out.println(name.concat(name));
//		System.out.println(name.indexOf("Gupta"));
		

	}

}
