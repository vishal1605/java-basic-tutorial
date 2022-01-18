package com.java.user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your details");
		
		int id = Integer.parseInt(rd.readLine());
		
		char gender = rd.readLine().charAt(0);
		String name = rd.readLine();
		
		long number = Long.parseLong(rd.readLine());
		
		System.out.println("All Details:- "+id+" :"+name);
		System.out.println(number);

	}

}
