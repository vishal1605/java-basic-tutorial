package com.java.user_input;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannnerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your details");
//		int id = sc.nextInt();
		
		String name = "";
		name+=sc.nextLine();
		
		
//		int age = sc.nextInt();
//		
//		String city = sc.next();
//		
//		String lastName = sc.next();
		
//		System.out.println("All Details --"+id+" :"+name+" :"+age+" :"+city+" :"+lastName);
		System.out.println(name);
		System.out.println("===============================================");
		
//		Scanner sc = new Scanner(System.in);
//		  
//        // Initialize sum and count of input elements
//        int sum = 0, count = 0;
//  
//        // Check if an int value is available
//        while (sc.hasNextInt())
//        {
//            // Read an int value
//            int num = sc.nextInt();
//            sum += num;
//            count++;
//        }
//        int mean = sum / count;
//        System.out.println("Mean: " + mean);

	}

}
